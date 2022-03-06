package JavaFundamentals.Coding;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni numrin: ");
        char x;
        int number = scanner.nextInt();
        String s = Integer.toString(number);
        int[] numbers = new int[s.length()];
        for (int i=0; i < s.length(); i++){
            x= s.charAt(i);
            numbers[i] = Character.getNumericValue (x);

        }
        System.out.println(Arrays.toString(numbers));
        for (int j=0;j<numbers.length;j++){
            System.out.println (numbers[j]);
            sum =sum+  numbers[j];
        }
        System.out.println("Shume eshte: " +sum);
    }
}
