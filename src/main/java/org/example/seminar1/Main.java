package org.example.seminar1;

import org.example.seminar1.factories.Strategy;
import org.example.seminar1.models.Message;
import org.example.seminar1.models.MessageTask;
import org.example.seminar1.models.Task;
import org.example.seminar1.runners.DelayTaskRunner;
import org.example.seminar1.runners.PrinterTaskRunner;
import org.example.seminar1.runners.StrategyTaskRunner;
import org.example.seminar1.runners.TaskRunner;
import org.example.seminar1.sorters.AbstractSorter;
import org.example.seminar1.sorters.BubbleSort;
import org.example.seminar1.sorters.SortingTask;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        testMessage();
        testTaskRunner(args);
        testSorters();
    }

    private static void testMessage() {
        List<Task> tasks = taskCreator();
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private static void testSorters(){
        int[] numere = {1,2,4,3,17,12,11};
        AbstractSorter bubble_sorter = new BubbleSort(numere);
        SortingTask sortingTask = new SortingTask("2", "d2", bubble_sorter);
        sortingTask.execute();
    }

    private static List<Task> taskCreator() {
        Message message1 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task1 = new MessageTask("1", "d1", message1);

        Message message2 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task2 = new MessageTask("2", "d2", message2);

        Message message3 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task3 = new MessageTask("3", "d3", message3);

        Message message4 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task4 = new MessageTask("4", "d4", message4);

        Message message5 = new Message("hello", "mircea", "fenesan", LocalDateTime.now());
        Task task5 = new MessageTask("5", "d5", message5);

        List<Task> tasks = new LinkedList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        return tasks;
    }

    private static void testTaskRunner(String[] args) {
        List<Task> tasks1 = taskCreator();
        List<Task> tasks2 = taskCreator();
        List<Task> tasks3 = taskCreator();

        if(args.length != 1){
            System.out.println("Introduceti doar o strategie!\n");
            return;
        }

        Strategy strat = Strategy.valueOf(args[0].toUpperCase());

        TaskRunner strategyTaskRunner = new StrategyTaskRunner(strat);
        TaskRunner delayTaskRunner = new DelayTaskRunner(strategyTaskRunner);
        TaskRunner printerTaskRunner = new PrinterTaskRunner(strategyTaskRunner);

        for (Task task : tasks1) {
            strategyTaskRunner.addTask(task);
        }

        System.out.println("Strategy Task Runner: ");
        strategyTaskRunner.executeAll();

        for(Task task: tasks2){
            printerTaskRunner.addTask(task);
        }

        System.out.println("Printer Task Runner: ");
        printerTaskRunner.executeAll();

        for(Task task: tasks3){
            delayTaskRunner.addTask(task);
        }

        System.out.println("Delay Task Runner: ");
        delayTaskRunner.executeAll();
    }
}
