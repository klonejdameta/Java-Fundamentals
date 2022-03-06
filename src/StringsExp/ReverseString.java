package StringsExp;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text to be reversed:");
        String str2 = scanner.nextLine();
        StringBuffer str=new StringBuffer(str2);//StringBuilder Class
        String str3=new StringBuilder(str2).reverse().toString();
        str.reverse();
        System.out.println(str);
        System.out.println(str3);*/

         String string;
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(string);//reverse method
        System.out.println("The reversed string is: " + reversed);
    }
       public static String reverseString(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}

