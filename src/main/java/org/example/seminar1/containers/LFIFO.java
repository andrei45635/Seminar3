package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Superclasa ce implementeaza interfata Container
 * Clase care extind superclasa: QueueContainer (coada) si StackContainer(stiva)
 */
public abstract class LFIFO implements Container {
    protected final List<Task> list = new ArrayList<>();
    /**
     * Sterge un element din Container
     * Returneaza elementul de tip Task care a fost sters
     * @return task
     */

    @Override
    public abstract Task remove();

    /**
     * Adauga un element in Container
     * @param task: Task, elementul de adaugat
     */
    @Override
    public void add(Task task){
        list.add(task);
    }

    /**
     * Returneaza marimea Containerului
     * @return int
     */

    @Override
    public int size(){
        return list.size();
    }

    /**
     * Returneaza true daca stiva/coada nu are elemente sau false altfel
     * @return true/false
     */
    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
}
