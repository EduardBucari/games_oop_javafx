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
        int size = Math.abs(position.getX() - dest.getX());
        Cell[] steps = new Cell[size];


        int deltaX = dest.getX() > position.getX() ? 1 : -1; // Если координата X у клетки dest будет
                                            // больше чем у position - значит дельта равна 1, иначе -1.
        int deltaY = dest.getY() > position.getY() ? 1 : -1;

        int x = position.getX(); // вычислить ячейку через index + deltaX
        int y = position.getY(); // вычистить ячейку через index + deltaY
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(x, y);
            x += deltaX;
            y += deltaY;
            // задача реализовать метод way G5 таким образом, чтобы он вернул массив
            // из четырех клеток: D2, E3, F4, G5.
            // Чтобы заполнить массив ячеек, нужно использовать метод Cell.findBy
            steps[index] = Cell.findBy(D2, E3, F4, G5.);

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
