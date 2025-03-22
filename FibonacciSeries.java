import java.util.Scanner;

public class FibonacciSeries
{
    static void Fib(int N)
    {
        int num1 = 0;
        int num2 =1;
        for(int i=0; i<N; i++)
        {
            System.out.println(num1);
            int num3=num2+num1;
            num1=num2;
            num2=num3;
    }
        }
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();

        System.out.println("FibonacciSeries="+N);

      Fib(N);
    }
}
