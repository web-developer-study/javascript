import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();
        System.out.println(getDay(month, date).toUpperCase());

    }

    public static String getDay(int month, int date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.ENGLISH);
        Date curretTime = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2007);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, date);
        simpleDateFormat.setCalendar(calendar);
        String mTime = simpleDateFormat.format(calendar.getTime());

        return mTime;
    }
}