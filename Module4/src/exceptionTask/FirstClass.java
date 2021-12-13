package exceptionTask;

import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        task1();
    }

    //1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void task1() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 2 numbers:");
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            scan.close();
            try {
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
            SecondClass.exc();
            ThirdClass.exc();

            int min = firstNum < secondNum ? firstNum : secondNum;
            System.out.println("Min num is: " + min);


    }
}
