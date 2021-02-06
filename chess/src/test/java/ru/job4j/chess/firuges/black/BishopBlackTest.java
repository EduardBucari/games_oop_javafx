package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    //  1. Проверка метода position. Создать объект и вызвать у него метод position.
    //   Проверьте, что он занимает ту же ячейку, что и при создании объекта.
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack.position();
    }

  // 2. Проверка метода copy. Создайте объект и вызовите у него метод copy.
  // Проверить, что, возвращенный объект имеет правильную позицию.
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        bishopBlack.copy(Cell.F8);
    }

    // 3. Создать тест-метод для проверки метода way. Для этого создайте объект с начальным положением C1.
    // Вызовите метод way G5. На данном этапе метод еще не реализован и ваша задача реализовать
    // его таким образом, чтобы он вернул массив из четырех клеток: D2, E3, F4, G5.
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5) ;  // ?


    }

    public void testIsDiagonal() {

    }


}