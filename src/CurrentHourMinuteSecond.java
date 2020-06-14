import java.util.Calendar;

public class CurrentHourMinuteSecond {
    public static void main(String[] args) {
        Calendar obj = Calendar.getInstance();
        System.out.println("Current Hour" + obj.get(Calendar.HOUR));
        System.out.println("Current Minute" + obj.get(Calendar.MINUTE));
        System.out.println("Current Second" + obj.get(Calendar.SECOND));
    }
}
