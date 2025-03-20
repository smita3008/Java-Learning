import java.util.Scanner;

public class DaysInMonth
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthnumber = sc.nextInt();
        String monthname= "--";
        int monthdays = 0;
        switch (monthnumber)
        {
            case 1:
               monthname = "Jan";
                monthdays = 31;
            break;
            case 2 :
                monthname = "Feb";
                monthdays = 28;
                break;
            case 3:
                monthname="march";
                monthdays = 31;
                break;
            case 4:
               monthname ="Apr";
                monthdays = 30;
                break;
            case 5:
                monthname ="May";
                monthdays = 31;
                break;
            case 6:
                monthname ="Jun";
                monthdays = 30;
                break;
            case 7:
                monthname ="July";
                monthdays = 31;
                break;
            case 8:
                monthname ="Aug";
                monthdays = 31;
                break;
            case 9:
                monthname ="Sep";
                monthdays = 30;
                break;
            case 10:
                monthname ="Oct";
                monthdays = 31;
                break;
            case 11:
                monthname ="Nov";
                monthdays = 30;
                break;
            case 12:
                monthname ="Dec";
                monthdays = 31;
                break;
            default:
                System.out.println("Invalid month number, month number should be less than equal to 12");
             return;
        }
        System.out.println("Number of days in month of " +monthname +" " + monthdays);
    }
}
