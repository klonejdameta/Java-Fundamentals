package JavaFundamentals;

public class Identifier {
    public static int x = 7;
    public int y = 3;

    public static void main(String[] args) {


        Identifier a = new Identifier();
        Identifier b = new Identifier();
        a.y = 5;
        b.y = 6;
        x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + x);
        System.out.println("b.x = " + x);
        System.out.println("Identifier.x = " + Identifier.x);
    }
}
