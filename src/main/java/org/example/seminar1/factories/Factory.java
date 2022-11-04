package org.example.seminar1.factories;

import org.example.seminar1.containers.Container;

import java.util.function.Supplier;

public interface Factory {
    Supplier<Container> createContainer(Strategy strategy);
}
