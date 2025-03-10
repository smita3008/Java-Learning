public class SwapNumberWithoutVariable
{
    public static void main(String[] args)
    {
        int i=10;
        int j=7;
        i=i-j; // 10-7=3
        j=i+j; // 3+7=10
        i=j-i; // 10-3=7
        System.out.println("After swapping value of i="+i);
        System.out.println( "After swapping value of j="+j);


    }
}
