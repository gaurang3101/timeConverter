import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TimeConverter {

    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void convertSecondsToTime() {
        int hour = seconds/(60*60);
        int minute = (seconds%(60*60))/60;
        int second = (seconds%(60*60))%60;
        System.out.println("Converted time = ");
        if (hour>1) System.out.print(hour + " hours, ");
        else System.out.print(hour + " hour, ");
        if (minute>1) System.out.print(minute + " minutes and ");
        else System.out.print(minute + " minute and ");
        if (second>1) System.out.print(second + " seconds");
        else System.out.print(second + " seconds");
    }
    public TimeConverter(int seconds) {
        this.seconds=seconds;
    }

}

class ConvertedTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of seconds to be converted - ");
        int s = sc.nextInt();
        TimeConverter tc = new TimeConverter(s);
        tc.convertSecondsToTime();
    }
}