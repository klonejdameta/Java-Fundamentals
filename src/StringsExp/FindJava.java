package StringsExp;

import java.util.Scanner;

public class FindJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the text:");
        String str = scanner.nextLine();

        boolean isFound = str.contains("Java");//check if the input text contains the word Java
        if (isFound) {
            System.out.println("Found Java");
        }
        boolean startsWith = str.startsWith("Java");//check if the text starts with word Java
        if (startsWith) {
            System.out.println("Starts with Java");
        }
        if (str.endsWith("Java")) {
            System.out.println("Ends with Java");//check if the text ends with word Java
        }
        if (str.equals("Java")) {
            System.out.println("Equals Java");//check if the input text is equal to Java
        }
        int indexOfJava = str.indexOf("Java"); //turns the index of the first occurrence of the word Java
        System.out.println("Index is " + indexOfJava);
    }
}

