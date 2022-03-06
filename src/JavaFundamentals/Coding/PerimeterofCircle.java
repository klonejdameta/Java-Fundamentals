package JavaFundamentals.Coding;

import java.util.Scanner;

public class PerimeterofCircle {
    Scanner sc=new Scanner(System.in);
    float diameter=sc.nextFloat();

    public  double findPerimetre(){
        double perimeter=Math.PI*diameter;
        System.out.println("Perimeter is "+perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        PerimeterofCircle perimeterofCircle=new PerimeterofCircle();
        perimeterofCircle.findPerimetre();

    }
}
