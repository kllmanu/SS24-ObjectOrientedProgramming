package at.fhv.mko7395.oop.uebung01;

public class Rectangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point c) {
        this.setCorners(a, c);
    }

    public Point[] getCorners() {
        return new Point[]{a, b, c, d};
    }

    public int getWidth() {
        return this.c.getX() - this.a.getX();
    }

    public int getHeight() {
        return this.c.getY() - this.a.getY();
    }

    public void setCorners(Point a, Point c) {
        this.a = a;
        this.b = new Point(c.getX(), a.getY());
        this.c = c;
        this.d = new Point(a.getX(), c.getY());
    }

    public void setCorners(Point a) {
        this.a = a;
        this.b = new Point(a.getX() + this.getWidth(), a.getY());
        this.c = new Point(a.getX() + this.getWidth(),a.getY() + this.getHeight());
        this.d = new Point(a.getX(), this.a.getY() + this.getHeight());
    }

    public void move(Point p) {
        this.setCorners(p);
    }
}