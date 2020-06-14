import java.util.Calendar;

public class displayMonthDateYear {
    public static void main(String[] args) {
        Calendar calendarObj = Calendar.getInstance();
        // month start from 0 to 11....so we add month+1
        System.out.println("Month :" + calendarObj.get(Calendar.MONTH + 1));
        System.out.println("Date :" + calendarObj.get(Calendar.DATE));
        System.out.println("Year :" + calendarObj.get(Calendar.YEAR));
    }
}
