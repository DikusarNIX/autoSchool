import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
       System.out.println("Hello world! " + printHelloName());
    }
    public static String printHelloName()
    {
       Scanner scanInput = new Scanner(System.in);
       String name= scanInput.nextLine();
       scanInput.close();
       return name;
    }
}
