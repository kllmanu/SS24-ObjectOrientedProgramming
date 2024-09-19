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
        return Math.abs(this.c.getX() - this.a.getX());
    }

    public int getHeight() {
        return Math.abs(this.c.getY() - this.a.getY());
    }

    public boolean isSquare() {
        return this.getWidth() == this.getHeight();
    }

    public void setCorners(Point a, Point c) {
        this.a = a;
        this.b = new Point(c.getX(), a.getY());
        this.c = c;
        this.d = new Point(a.getX(), c.getY());
    }

    public void setCorners(Point a) {
        int x = a.getX() + this.getWidth();
        int y = a.getY() + this.getHeight();

        Point c = new Point(x, y);

        this.setCorners(a, c);
    }

    public void move(Point p) {
        this.setCorners(p);
    }

    public int getPerimeter() {
        return 2 * this.getWidth() + 2 * this.getHeight();
    }

    public void zoom(int factor) {
        if (factor == 0) {
            return;
        }

        int scaleX = this.getWidth() * factor;
        int scaleY = this.getHeight() * factor;

        this.setCorners(this.a,
                new Point(this.a.getX() + scaleX, this.a.getY() + scaleY)
        );
    }
}