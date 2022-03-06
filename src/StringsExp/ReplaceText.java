package StringsExp;

import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the text");
        String str1=scanner.nextLine();
        System.out.println("New text is "+str1.replaceAll(",", "MAKARENA"));
    }
}
