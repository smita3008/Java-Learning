import java.util.Scanner;

public class GreaterNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int temp = ((num1 > num2) ? num1 : num2);
        int max = ((num3 >temp) ? num3:temp);
        System.out.println("Greater number is=" + max);



    }
}
