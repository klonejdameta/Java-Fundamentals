package JavaFundamentals.Coding;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DaysBetweenTwoDt {
    public static void main(String[] args) {
        String dateBeforeString = "2022-03-05";
        String dateAfterString = "2022-10-02";
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
        LocalDate dateAfter = LocalDate.parse(dateAfterString);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
    }

}
