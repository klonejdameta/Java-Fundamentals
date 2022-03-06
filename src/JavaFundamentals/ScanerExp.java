package JavaFundamentals;

import java.util.Scanner;

public class ScanerExp {

    int shumaNumrave(int a, int b, int c) {
        if (a < 10) {

            a = a + 5;
        }
        if (b < 10) {
            b = b + 5;
        }
        if (c < 10) {
            c = c + 5;
        }
        int sum1 = a + b + c;
        System.out.println("numrat " + a + " " + b + " " + c);
        return sum1;
    }

    public static void main(String[] args) {
        ScanerExp scanerExp = new ScanerExp();
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println("Numrat jane " + a + b + c);
        System.out.println(scanerExp.shumaNumrave(a, b, c));
        scanerExp.shumaNumrave(a, b, c);

    }
}
