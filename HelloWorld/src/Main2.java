import java.util.Scanner;
import com.welcome.Hello;

public class Main2
{
    public  static void main (String[] args)
    {
        Scanner scanInput = new Scanner(System.in);
        String name= scanInput.nextLine();
        scanInput.close();

        Hello hello = new Hello();

        hello.setupName(name);

        hello.welcome();
        System.out.println("Hello world!");
        hello.byeBay();
    }
}
