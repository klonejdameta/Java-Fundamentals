package JavaFundamentals.Coding;

import java.util.Scanner;

public class SumofDigits {
   public static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(  getSum(1425));


    }

}
