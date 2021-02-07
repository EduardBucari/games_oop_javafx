package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Ignore
    @Test(expected = FigureNotFoundException.class)
    public void move()
            throws FigureNotFoundException {
        //Для этого теста надо начинать ход с другой клетки, Т.е. когда фигура не найдена.
        Logic logic = new Logic();
        logic.add(new BishopBlack(null));
        logic.move(Cell.C1, Cell.H6);

    }

    @Test(expected = OccupiedCellException.class)
    public void move()
            throws OccupiedCellException {
        // Для этого теста должно быть 2 фигуры, чтобы вторая стояла на пути следвания первой фигуры
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.G5));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void move()
            throws ImpossibleMoveException {
        // Для этого теста фигура должна ходить не по диагонали
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.G4);
    }
}