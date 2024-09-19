package at.fhv.mko7395.oop.uebung01;

public class Main {
    private static String grid = """
            <defs>
                <pattern id="grid" width="50" height="50" patternUnits="userSpaceOnUse">
                    <path d="M 50 0 L 0 0 0 50" fill="none" stroke="gray" stroke-width="1"/>
                </pattern>
            </defs>
            <rect width="100%" height="100%" fill="url(#grid)" />""";

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(
                new Point(350, 50),
                new Point(450, 450),
                "black"
        );

        Rectangle r2 = new Rectangle(
                new Point(50, 150),
                new Point(350, 250),
                "black"
        );

        Rectangle r3 = new Rectangle(
                new Point(50, 350),
                new Point(350, 450),
                "black"
        );

        System.out.printf("<svg height='%d' width='%d'>%n", 501, 501);
        System.out.println(Main.grid);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("</svg>");
    }

}
