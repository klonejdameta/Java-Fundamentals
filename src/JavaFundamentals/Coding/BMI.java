package JavaFundamentals.Coding;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float BMI;
        System.out.print("Please input your weight in kilograms: ");
        float weight= scanner.nextFloat();
        System.out.print("Please input your height in centimeters: ");
        int height= scanner.nextInt();
        float height1=height;
    /*float i;
    i=height1/100;
    System.out.println("Height="+i+"m");
    BMI=weight/(i*i);
     */
        BMI=weight/((height1/100)*(height1/100));
        System.out.println("BMI="+BMI);
        if (BMI>18.5 && BMI<24.9){
            System.out.println("BMI optimal");
        }else {
            System.out.println("BMI not optimal");
        }
    }
}
