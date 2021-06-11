package ru.tcreator.userInterface.out;

import java.util.Optional;

public class ReadConsole implements Reading {
    /**
     * TODO дописать класс взаимодействия с терминалом
     */

    public ReadConsole() {

    }

    @Override
    public Optional<String> readText() {

        return Optional.empty();
    }

    @Override
    public Optional<Number> readNumber() {
        return Optional.empty();
    }
}
