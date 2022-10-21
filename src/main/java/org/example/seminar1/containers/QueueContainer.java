package org.example.seminar1.containers;

import org.example.seminar1.models.Task;

import java.util.ArrayList;
import java.util.List;

public class QueueContainer extends LFIFO{
    @Override
    public Task remove() {
        return list.remove(0);
    }
}
