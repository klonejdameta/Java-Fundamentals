package JavaFundamentals.ClassExmp;

//check if number is prime
public class PrimeNumber {
    //prints numbers prime till the input length
    public static void printPrimeNumbers (int lengthPrime){

        int primeNumberCount = 1;
        int numberToCheck = 2;

        while (primeNumberCount <= lengthPrime) {
            if (isPrime (numberToCheck)) {
                primeNumberCount++;
                System.out.print (numberToCheck + " ");
            }
            numberToCheck++;
        }

    }

    //check  if number % 2 or not
    private static boolean isPrime (int number){
        for (int i = 2; i <= Math.sqrt (number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main (String[] args){
        printPrimeNumbers(4);
        System.out.println ();
        printPrimeNumbers(7);
    }
}
