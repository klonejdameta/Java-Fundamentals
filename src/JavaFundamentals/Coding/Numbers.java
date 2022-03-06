package JavaFundamentals.Coding;

import java.util.Scanner;

public class Numbers {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {//shkruhet i pari sepse te dy e plotesojne kushtin dhe ndodhet brenda for
            System.out.println(i);
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else if (i % 7 == 0) {
                System.out.println("fizz");
            }

        }

    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.fizzBuzz(10);
    }

}