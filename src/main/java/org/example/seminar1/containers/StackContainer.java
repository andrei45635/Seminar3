package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends LFIFO {
    //LastInFirstOut
    //private Task[] arr_stack = new Task[]; //tip primitiv, mai rapid decat wrapper

    @Override
    public Task remove() {
        return list.remove(size() - 1);
    }

}
