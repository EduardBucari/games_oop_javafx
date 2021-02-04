package ru.job4j.chess;

public class OccupiedCellException extends Exception {
    // добавим конструктор
    public OccupiedCellException(String message) {
        super(message);
    }
}
