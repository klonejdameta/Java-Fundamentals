package JavaFundamentals.Coding;

import java.util.Scanner;

public class StringRegEx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sneez= scanner.nextLine();
        System.out.println(sneez.matches("achoooo!"));
    }
}
