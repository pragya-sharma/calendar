import java.util.Calendar;
import java.util.Date;

public class CreateDate {
    public static void main(String[] args) {
        Calendar obj = Calendar.getInstance();
        obj.set(Calendar.MONTH, 5);
        obj.set(Calendar.YEAR, 2020);
        obj.set(Calendar.DATE, 2);

        Date date = obj.getTime();
        System.out.println(date);
    }
}
