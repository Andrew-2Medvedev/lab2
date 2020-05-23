package ru.spbstu.main.shapes;

public class TruePoint implements Point {

    private float y;
    private float x;

    public TruePoint(float x, float y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void move(float dx, float dy) {
        y += dy;
        x += dx;
    }

    @Override
    public float distanceFrom(Point b) {
        return (float) Math.sqrt(Math.pow(b.getX() - getX(), 2) + Math.pow(b.getY() - getY(), 2));
    }
}
