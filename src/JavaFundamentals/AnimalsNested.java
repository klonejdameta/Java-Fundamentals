package JavaFundamentals;

public class AnimalsNested {
    public  class Dog{
      String  name="Lassy";
        public String getsName(String name){
            System.out.println("name is "+name);
            return name;
        }
    }

    public static void main(String[] args) {
        AnimalsNested animalsNested=new AnimalsNested();
        AnimalsNested.Dog dog=animalsNested.new Dog();
        dog.getsName(dog.name);
    }
}
