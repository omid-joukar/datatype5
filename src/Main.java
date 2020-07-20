import java.util.Scanner;

/**
 * Created by KPS on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
    long timeZoneChange = input.nextInt();

    long totalMilliseconds = System.currentTimeMillis();

    long totalSeconds = totalMilliseconds / 1000;

    long currentSecond = totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;

    long currentMinute = totalMinutes % 60;

    long totalHours = totalMinutes / 60;

    long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
}
}
