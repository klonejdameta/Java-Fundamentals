package JavaFundamentals.Coding;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleText {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String res=" ";
        for (int i=0;i<arr.length;i++) {
            res = arr[i] + " " + arr[i] + " ";


            System.out.println(res);
        }
    }
}
