package JavaFundamentals.Coding;

import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        double i, s = 0.0; int n=5;
        for (i = 1; i <= n; i++)
            s = s + 1/i;
        System.out.println("sum is "+s);
    }
}
