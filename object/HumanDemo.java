package object;

public class HumanDemo
{
    public static void main(String[] args)
    {
        Human h1= new Human();
        h1.name = "Smita";
        h1.age=30;
        h1.country="India";
        System.out.println(h1.name+ "" + h1.age + "" + h1.country);

        Human h2= new Human();
        System.out.println(h2.country);
    }


}

class Human
{
    String name;
    int age;
    static String country;

}
