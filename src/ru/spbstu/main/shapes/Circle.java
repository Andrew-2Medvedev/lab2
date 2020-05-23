package ru.spbstu.main.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    public Point center;
    public float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public float getLength() {
        return 2f * (float) Math.PI * radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2f));
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public void moveBy(float dx, float dy) {
        center.move(dx, dy);
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
