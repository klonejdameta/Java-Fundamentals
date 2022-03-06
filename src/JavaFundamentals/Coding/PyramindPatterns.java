package JavaFundamentals.Coding;

public class PyramindPatterns {
    public  static void  printPyramind(int rows){
        for (int i=1;i<=rows;i++){
            for (int j=rows;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPyramind(4);
    }
}
