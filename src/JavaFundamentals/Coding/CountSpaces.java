package JavaFundamentals.Coding;

import javax.swing.*;
import java.util.Scanner;

public class CountSpaces {
    public static int countSpace(String s,char a){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==a)
                count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char x = ' ';
        System.out.println(countSpace(input, x));
        int result = countSpace(input, x);
        double occurrence = (result * 100) / input.length();
        System.out.println(occurrence);
    }

}
