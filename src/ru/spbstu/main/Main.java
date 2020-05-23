package ru.spbstu.main;

import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.TruePoint;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Triangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.awt.*;

public class Main {
    static Shape getMaxShapeByArea(Shape[] shapes) {
        final Optional<Shape> maxAreaShape = Arrays.stream(shapes).max(Comparator.comparingDouble(Shape::getArea));
        return maxAreaShape.orElse(null);
    }

    public static void main(String[] args) {
        int s = 0;
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < 10; ++i) {
            s = i % 3;
            if (s==0){
                shapes[i] = new Circle(new TruePoint(0, 0), 1);
            }
            else if (s==1){
                shapes[i] = new Triangle(
                        new TruePoint(0, 0),
                        new TruePoint(0, 10),
                        new TruePoint(10, 0),
                        0);
            }
            else if (s==2){
                shapes[i] = new Rectangle(
                        new TruePoint(0f, 0f), 5f, 3f, 0);
            }
        }


        final Shape maxAreaShape = getMaxShapeByArea(shapes);
        System.out.println("Площадь фигуры с максимальной площадью " + maxAreaShape.getArea());

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
}
