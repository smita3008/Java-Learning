import java.util.Scanner;
public class ArithmaticOperationUserInput
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number1");
        int i=scanner.nextInt();
        System.out.println("Enter number2");
        int j=scanner.nextInt();
        int sum=Math.addExact(i,j);
        System.out.println("Sum of the number"+ "=" + sum);
        int diff= Math.subtractExact(i,j);
        System.out.println("Difference of the number"+ "=" + diff);
        int product=Math.multiplyExact(i,j);
        System.out.println("Product of the number"+ "=" + product);
        int avg=Math.addExact(i,j)/2;
        System.out.println("Average of two number"+"=" +avg);
        int dis=diff;
        System.out.println("Distance of the number"+ "=" + dis);
        int max=Math.max(i,j);
        System.out.println("Maximum number"+ "=" +  max);
        int min=Math.min(i,j);
        System.out.println("Minimum of number" + "=" +  min);



    }
}
