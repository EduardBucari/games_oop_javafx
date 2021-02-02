package ru.job4j.chess;

public class ImpossibleMoveException extends Exception {
    // добавим конструктор
    public ImpossibleMoveException(String message) {
        super(message);
    }
}
