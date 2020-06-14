import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = new Date();
        String var = obj.format(date);
        System.out.println(var);
    }
}
