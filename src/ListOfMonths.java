import java.text.DateFormatSymbols;

public class ListOfMonths {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] monthArrayy = dateFormatSymbols.getMonths();
        for (String var : monthArrayy) {
            System.out.println(var);
        }
    }
}
