import java.text.DateFormatSymbols;

public class ListOfDays {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] monthArrayy = dateFormatSymbols.getWeekdays();
        for (String var : monthArrayy) {
            System.out.println(var);
        }
    }
}
