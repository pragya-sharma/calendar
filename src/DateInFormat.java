import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInFormat {
    public static void main(String[] args) {
        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
        String date = obj.format(new Date());
        System.out.println(date);

    }
}
