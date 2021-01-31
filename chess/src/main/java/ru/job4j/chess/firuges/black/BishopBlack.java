package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    // 3. Задача реализовать метод way таким образом,
    // чтобы он вернул массив из четырех клеток: D2, E3, F4, G5.
    // Чтобы заполнить массив ячеек, нужно использовать метод Cell.findBy
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = 4;
        Cell[] steps = new Cell[size];
        int deltaX = +1-1;
        int deltaY = -1-1;
        int x = index + deltaX; // вычислить ячейку через index + deltaX
        int y = index + deltaY; // вычистить ячейку через index + deltaY
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
