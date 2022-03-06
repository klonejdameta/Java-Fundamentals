package StringsExp;

public class StringVarArgs {
    static  void  callOfstring(String str1,String...input){
        for (String x:input){
            System.out.println(str1 + x);
        }
    }
     void  printNum(int...nr){
        System.out.println("Total is "+nr.length);//find total of elements
        for (int i:nr){
            System.out.println("Number is "+i);//returns the total nr of elm
        }
    }
    public  int shtoVlere(int x,int...numb){
        int sum=0;
        for (int i:numb){
            sum=x+i;
            System.out.println(x+i);
        }
        return sum;

    }

    public static void main(String[] args) {
        StringVarArgs stringVarArgs=new StringVarArgs();
        stringVarArgs.printNum(1,2,3);
        callOfstring("Kloi","Hello","Meta");
        stringVarArgs.shtoVlere(10,1,2);
    }
}
//varargs na mundesojne te fusim nga 0 deri ne sa parametra duam