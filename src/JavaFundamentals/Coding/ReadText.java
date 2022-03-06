package JavaFundamentals.Coding;

import javax.swing.*;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String longestWord="";
        String input="";
        do {
            input =scanner.nextLine();

            if (input.length()>longestWord.length()){
                longestWord=input;
            }
        }
        while (!input.equalsIgnoreCase("Enough!"));
        System.out.println(longestWord);
    }
    }