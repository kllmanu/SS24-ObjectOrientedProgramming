package at.fhv.mko7395.oop.uebung01;

public class Rectangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point c) {
        this.a = a;
        this.b = new Point(c.getX(), a.getY());
        this.c = c;
        this.d = new Point(a.getX(), c.getY());
    }

    public Point[] getCorners() {
        return new Point[]{a, b, c, d};
    }
}