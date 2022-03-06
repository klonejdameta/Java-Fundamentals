package puppyfirstprogram;

public class Puppy {
    private final String puppyName;
    private final int puppyAge;

    public Puppy(String puppyName, int puppyAge) {
        this.puppyAge = puppyAge;
        this.puppyName = puppyName;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "puppyName='" + puppyName + '\'' +
                ", puppyAge=" + puppyAge +
                '}';
    }
}
