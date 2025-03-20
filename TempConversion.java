import java.util.Scanner;

public class TempConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Celsius Temp");
        double celsius = sc.nextDouble();
        double Fahrenheit= celsius*(1.8)+(32); // 1 far
        double Kelvin = celsius+273;
        System.out.println("Conversion of Celsius to Fahrenheit is " + Fahrenheit);
        System.out.println("Conversion of Celsius to Kelvin is"+Kelvin);

    }
}
