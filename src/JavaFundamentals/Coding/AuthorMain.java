package JavaFundamentals.Coding;

import java.util.Arrays;

public class AuthorMain {
    public static void main(String[] args) {
        Poem poem = new Poem(new Author("Kadare", "Alb"), 70);
        Author author = new Author();
        author.setSurname("Agolli");
        author.setNationality("Alb");
        author.setSurname("Flober");
        Poem poem1 = new Poem(author, 30);
        Poem poem2 = new Poem(author, 60);

        Poem[] arr = new Poem[3];
        arr[0] = poem;
        arr[1] = poem1;
        arr[2] = poem2;
        int max = -999;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i].getAuthor().getSurname());
            //System.out.println(arr[i].getStropheNumbers());
            if (arr[i].getStropheNumbers() > max) {
                max = arr[i].getStropheNumbers();
                System.out.println(arr[i].getAuthor().getSurname());
            }
        }
        System.out.println(max);

    }
}