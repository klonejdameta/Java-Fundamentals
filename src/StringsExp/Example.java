package StringsExp;

public class Example {
    static int sum(int...elm){ //VarArgs
        int res=0;
        for (int i:elm){
            res+=i;
        }
        return res;
    }
       static  int sumElm(int a , int...num){
        return a;
       }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println( sumElm(1,2,3,2,5,5,2,5));//varargs start from 0 to e defined
                                                               //number ofe elements,when we call the method we
                                                               //always need parameters,bc we have e predifined a
                                                                //method to have e parameter
    }
}
