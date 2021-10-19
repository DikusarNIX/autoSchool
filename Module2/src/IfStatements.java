import java.util.Random;
import java.util.Scanner;

//Задачи на условные операторы
public class IfStatements {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task7();
    }

    //1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        scan.close();
        int min = firstNum < secondNum ? firstNum : secondNum;
        System.out.println("Min num is: " + min);
    }

    //2 Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int thirdNum = scan.nextInt();
        int fourthNum = scan.nextInt();
        scan.close();
        int max = 0;
        max = firstNum > secondNum ? firstNum : secondNum;
        max = max > thirdNum ? max : thirdNum;
        max = max > fourthNum ? max : fourthNum;
        System.out.println("Max num is: " + max);
    }

    //3 Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int thirdNum = scan.nextInt();
        scan.close();
        int x = 0;

        if (firstNum < secondNum) {
            x = secondNum;
            secondNum = firstNum;
            firstNum = x;
        }
        if (firstNum < thirdNum) {
            x = thirdNum;
            thirdNum = firstNum;
            firstNum = x;
        }
        if (secondNum < thirdNum) {
            x = thirdNum;
            thirdNum = secondNum;
            secondNum = x;
        }
        System.out.println(firstNum + " " + secondNum + " " + thirdNum);
    }

    /*4 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».*/
    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 names:");
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        scan.close();

        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }

    //5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    //6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and age (ex. \"Name 15\"):");
        String personData = scan.nextLine();
        scan.close();

        Integer age = Integer.parseInt(personData.split(" ")[1]);
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }

    /*7 За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.*/
    public static void task7() {
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);

        Boolean success = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number");
        for (int i = 0; i < 7; i++) {
            int num = scan.nextInt();
            if (num == secret) {
                System.out.println("Угадал :)");
                success = true;
                break;
            } else if (num > secret) {
                System.out.println("Много");
            } else {
                System.out.println("Мало");
            }
        }
        scan.close();

        if (success == false) {
            System.out.println("Не угадал :(");
        }
    }
}
