package ru.tcreator.userInterface.out;

import java.util.Optional;

public interface Reading {
    Optional<String> readText();
    Optional<Number> readNumber();
}
