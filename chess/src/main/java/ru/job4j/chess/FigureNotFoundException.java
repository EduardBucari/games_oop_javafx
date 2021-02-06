package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    // добавим конструктор
    public FigureNotFoundException(String message) {
        super(message);
    }
}
