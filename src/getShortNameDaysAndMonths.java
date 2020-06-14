import java.text.DateFormatSymbols;

public class getShortNameDaysAndMonths {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        System.out.println("Short name of months");
        String[] monthArrayy = dateFormatSymbols.getShortMonths();
        for (String var : monthArrayy) {
            System.out.println(var);
        }
        System.out.println("Short name of days");
        String[] monthArray = dateFormatSymbols.getShortWeekdays();
        for (String vari : monthArray) {
            System.out.println(vari);
        }
    }
}
