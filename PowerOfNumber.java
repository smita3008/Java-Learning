import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

           System.out.println("Enter the number:" );
        double num = sc.nextDouble();

        double square = Math.pow(num,2);
        double cube = Math.pow(num,3);
        double fourth = Math.pow(num,4);


        System.out.println("Square of the number=" + square);
        System.out.println("Cube of the number"+cube);
        System.out.println("Fourth of the number" +fourth);

    }
}
