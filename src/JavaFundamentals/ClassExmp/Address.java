package JavaFundamentals.ClassExmp;

public class Address {
    private int floor;
    private String city;
    private String palace;

    public Address() { //constructor without paramters, it helps to create an object at TestAddress class with no parameters
        //since I have declared a constructor with parameters.

    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPalace() {
        return palace;
    }

    public void setPalace(String palace) {
        this.palace = palace;
    }

    public Address(int floor, String city, String palace) {
        this.floor = floor;
        this.city = city;
        this.palace = palace;



    }

}
