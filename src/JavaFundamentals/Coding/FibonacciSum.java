package JavaFundamentals.Coding;

public class FibonacciSum {
    static  int fibonacciNumber(int n){
        if (n<=1){
            return n;
        }else return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static void main(String[] args) {
      int s=  fibonacciNumber(7);
        System.out.println(s);

    }
}
/*
int x1=0,x2=1;
sout(x0,x1)
int x3;//metodes i kalojme parameter n
for(int i=2;i<n;i++){
x3=x0+x1;
sout(x3)
x0=x1;
x1=x2;
}

 */