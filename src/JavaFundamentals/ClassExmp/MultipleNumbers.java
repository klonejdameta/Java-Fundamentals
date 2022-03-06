package JavaFundamentals.ClassExmp;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the number to multiple ");
        int n= scanner.nextInt();
        for (int i=0;i<10;i++){
            System.out.println(n + " x " + (i+1) + " = " +
                    (n * (i+1)));
        }
    }
}
