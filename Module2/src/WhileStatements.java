import java.util.Scanner;

public class WhileStatements {
    public static void main(String[] args) {
        task8();
        task9();
        task10();
        task11();
        task12();
    }

    //8 Вывести на экран числа от 1 до 10, используя цикл while.
    public static void task8() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    //9 Вывести на экран числа от 10 до 1, используя цикл while.
    public static void task9() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    /*10 Ввести с клавиатуры строку и число N.
    Вывести на экран строку N раз, используя цикл while.
    Пример ввода:
    абв
    2
    Пример вывода:
    абв
    абв*/
    public static void task10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print line:");
        String line = scan.nextLine();
        System.out.println("Print number:");
        int count = scan.nextInt();
        scan.close();

        int i = 0;
        while (i < count) {
            System.out.println(line);
            i++;
        }
    }

    //11 Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
    public static void task11() {
        int j = 0;
        while (j < 10) {
            int i = 0;
            while (i < 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
            j++;
        }
    }

    /*12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
    Example output:
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    3 6 9 12 15 18 21 24 27 30*/
    public static void task12() {
        int j = 1;
        while (j <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print(i * j + " ");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}
