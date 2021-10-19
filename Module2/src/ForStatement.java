import java.util.Scanner;

public class ForStatement {

    public static void main(String args[]) {
        //task13();
        //task14();
        task15();
        //task16();
        //task17();
        //task18();
    }

    //13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
    public static void task13() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    /*14 Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    Пример: m=2, n=4
    8888
    8888*/
    public static void task14() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = scan.nextInt();
        System.out.println("Enter second number:");
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    /*15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    Пример:
    8
    88
    888
    ...*/
    public static void task15() {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    /*16 Используя цикл for вывести на экран:
    - горизонтальную линию из 10 восьмёрок
    - вертикальную линию из 10 восьмёрок.*/
    public static void task16() {
        for (int i = 0; i < 10; i++) {
            System.out.print("8");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }

    /*17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    Пример текста:
    Света любит меня.
    …*/
    public static void task17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scan.nextLine();
        scan.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }

    /*18 Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
    Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
    Thread.sleep(100); //задержка на одну десятую секунды.
    Пример:
    30
    29
    …
    1
    0
    Бум!*/
    public static void task18() {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
        System.out.println("Бум!");
    }
}
