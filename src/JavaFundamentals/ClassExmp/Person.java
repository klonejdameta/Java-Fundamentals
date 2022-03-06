package JavaFundamentals.ClassExmp;

public class Person {
    private String name;
    private Address address; //it holds fields of Address Class and connects both classes


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;


    }

}
