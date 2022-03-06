package JavaFundamentals;

public class NestedClasses {
    public  class InnerClass{
        void print(){
            System.out.println("I am a nested class");
        }
    }
   public static class StaticInner{
        void testStatic(){
            System.out.println("I am a static class");
        }
    }
    public static void main(String[] args) {
        NestedClasses nestedClasses=new NestedClasses();
        NestedClasses.InnerClass innerClass=nestedClasses.new InnerClass();//access the inner class
        innerClass.print();
        NestedClasses.StaticInner staticInner=new NestedClasses.StaticInner();//the static inner class
        staticInner.testStatic();
    }
}
