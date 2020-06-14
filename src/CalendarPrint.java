import java.util.Calendar;

public class CalendarPrint {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
    }
}
