package JavaFundamentals.Coding;

public class Poem {
    private Author author; //create e field using the Author object
    private int stropheNumbers;

    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }



}

