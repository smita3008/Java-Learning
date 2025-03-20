import java.text.DecimalFormat;
import java.util.Scanner;

public class InchesToMeterConversion
{
    public static void main(String[] args) {
        double inches= 0.0254; //1 inch=0.0254m

      Scanner scan= new Scanner(System.in);
       System.out.println("Enter Inches to convert to Meter=");
       double input=scan.nextDouble();
        double meter = input*inches;
        DecimalFormat dc=new DecimalFormat("0.00");
        System.out.println("Meter=" + dc.format(meter) );


    }
}
