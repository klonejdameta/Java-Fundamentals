package JavaFundamentals.Coding;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);

            // performs division between numbers
            case '/':

                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                if (number2==0){
                    System.out.println("Error while divide by 0");
                    return;
                }
                else{ result=number1/number2;}

            break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}