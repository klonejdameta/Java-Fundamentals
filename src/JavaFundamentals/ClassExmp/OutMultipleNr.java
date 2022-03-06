package JavaFundamentals.ClassExmp;

import java.util.Scanner;

public class OutMultipleNr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("5");
            }
            if (i != n) {
                System.out.print(" ");
            }
        }
    }
}
