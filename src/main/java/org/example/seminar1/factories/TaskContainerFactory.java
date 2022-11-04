package org.example.seminar1.factories;

import org.example.seminar1.containers.Container;
import org.example.seminar1.containers.QueueContainer;
import org.example.seminar1.containers.StackContainer;

import java.util.function.Supplier;

public class TaskContainerFactory implements Factory {

    private final static TaskContainerFactory taskContainerFactory = new TaskContainerFactory();

    private TaskContainerFactory(){}

    public static TaskContainerFactory getInstance(){
        return taskContainerFactory;
    }

    @Override
    public Supplier<Container> createContainer(Strategy strategy){
    //public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.LIFO) {
            //return new StackContainer();
            return StackContainer::new;
        } else if (strategy == Strategy.FIFO){
            //return new QueueContainer();
            return QueueContainer::new;
        }
        return null;
    }
}
