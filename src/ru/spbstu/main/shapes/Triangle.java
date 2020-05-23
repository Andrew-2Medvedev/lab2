package ru.spbstu.main.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private Point[] vertices;
    private float[] sideLengths;
    private float perimeter;
    private int rotationAngle;

    public Triangle(final Point a, final Point b, final Point c, final int rotationAngle) {
        this.vertices = new Point[3];

        assert a != null && b != null && c != null;

        this.vertices[0] = a;
        this.vertices[1] = b;
        this.vertices[2] = c;

        this.rotationAngle = rotationAngle;
    }

    @Override
    public float getPerimeter() {
        if (sideLengths == null) {
            sideLengths = new float[3];
        } else {
            return perimeter;
        }

        perimeter = 0;
        for (int i = 0; i < 3; ++i) {
            sideLengths[i] = this.vertices[i].distanceFrom(this.vertices[(i + 1) % 3]);
            perimeter += sideLengths[i];
        }

        return perimeter;
    }

    @Override
    public float getArea() {
        final float halfOfPerimeter = getPerimeter() / 2f;
        return (float) Math.sqrt(halfOfPerimeter * (halfOfPerimeter - sideLengths[0])
                * (halfOfPerimeter - sideLengths[1]) * (halfOfPerimeter - sideLengths[2]));
    }

    @Override
    public Point getCenter() {
        float centerX = 0f;
        float centerY = 0f;
        for (Point vertex : vertices) {
            centerX += vertex.getX();
            centerY += vertex.getY();
        }
        centerX /= 3f;
        centerY /= 3f;

        return new TruePoint(centerX, centerY);
    }

    @Override
    public int getRotation() {
        return rotationAngle;
    }

    @Override
    public void moveBy(float dx, float dy) {
        for (Point vertex : vertices) {
            vertex.move(dx, dy);
        }
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
