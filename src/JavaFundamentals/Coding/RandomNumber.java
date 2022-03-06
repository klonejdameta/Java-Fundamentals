package JavaFundamentals.Coding;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Random random=new Random();
        int min=0;
        int max=100;
        int nr=random.nextInt(max);

        if (n>nr){
            System.out.println("Too much "+n);
        }else
            if (n < nr) {
                System.out.println("Too litle " + n);
            }
       else {
                System.out.println("Equals");
            }
    }
}
