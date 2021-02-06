package ru.job4j.chess;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import java.util.Arrays;

public final class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        figures[index++] = figure;
    }

    public void move(Cell source, Cell dest)
            throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        int index = findBy(source);
        Cell[] steps = figures[index].way(dest);
        free(steps);
        figures[index] = figures[index].copy(dest);
    }



    // 5. В классе Logiс метод free. Метод free должен пройтись по массиву figures и проверить,
    // что фигуры не занимают элементы из массива steps.
    //Если они занимают ячейки steps, то метод должен кинуть исключение.
    private boolean free(Cell[] steps) throws OccupiedCellException {
        for (int index = 0; index < figures.length; index++) {
            Figure figure = figures[index];
            for (int i = 0; i < steps.length; i++) {
                if (figure != null && figure.position().equals(cell)) { // ?
                    throw new OccupiedCellException(
                            String.format("The Cell is occupied")
                    );
                }
            }
        }
        return true;
    }

    public void clean() {
        Arrays.fill(figures, null);
        index = 0;
    }

    private int findBy(Cell cell) throws FigureNotFoundException {
        for (int index = 0; index != figures.length; index++) {
            Figure figure = figures[index];
            if (figure != null && figure.position().equals(cell)) {
                return index;
            }
        }
        throw new FigureNotFoundException();
    }
}
