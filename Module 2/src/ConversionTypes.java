import java.util.Scanner;

public class ConversionTypes
{
    public static void main(String[] args)
    {
        task1(21,8);
        task2(48);
        task3(22.95);
        task4(3,6,2);
    }

    public static void task1 (int q, int w)
    {
        System.out.println(q + "/" + w + "=" + q/w + " and " + q%w + " in last");
    }

    public static void task2 (int n)
    {
        int length = String.valueOf(n).length();
        if(length == 2)
        {
            char firstNumber = String.valueOf(n).charAt(0);
            char secondNumber = String.valueOf(n).charAt(1);
            int sum = Character.getNumericValue(firstNumber) + Character.getNumericValue(secondNumber);
            System.out.println(sum);
        }
        else
        {
            System.out.println("Try again");
        }
    }

    public static void task3 (double n)
    {
        System.out.println(Math.round(n));
    }

    public static void task4(int a, int b, int c)
    {
        int i = a+b;
        int j = c-a;
        int k = a+b+c;
        System.out.println("a=" + i + ", b=" + j + ", c=" + k);
    }
}
