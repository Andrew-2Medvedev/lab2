package ru.spbstu.main.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private Point center;
    private float width;
    private float height;
    private int rotationAngle;

    public Rectangle(Point center, float width, float height, int rotationAngle) {
        this.center = center;
        this.width = width;
        this.height = height;
        this.rotationAngle = rotationAngle;
    }

    @Override
    public float getPerimeter() {
        return 2f * (width + height);
    }

    @Override
    public int getRotation() {
        return rotationAngle;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public void moveBy(float dx, float dy) {
        this.center.move(dx, dy);
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
