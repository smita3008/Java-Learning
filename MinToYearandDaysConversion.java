import java.util.Scanner;

public class MinToYearandDaysConversion
{
    public static void main(String[] args) {

        int minutesInYear=60*24*365;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minutes=");
        double minutes= sc.nextDouble();
        int year = (int) (minutes)/(minutesInYear);
        int days = (int) (minutes/60/24) % 365;
                        System.out.println("years=" + year + "\nDays="+days);
    }
}
