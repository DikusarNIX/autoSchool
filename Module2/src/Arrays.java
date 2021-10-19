import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }

    /*-1-
Максимальное среди массива на 20 чисел.
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
    public static void task1() {
        System.out.println(max(initializeArray()));
    }

    public static int[] initializeArray() {
        int[] num = new int[20];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 20 nums:");
        for (int i = 0; i < 20; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        return num;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /*-2-
Массив из строчек в обратном порядке.
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
    public static void task2() {
        String[] list = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 8 rows:");
        for (int i = 0; i < 8; i++) {
            list[i] = scan.nextLine();
        }
        scan.close();

        System.out.println("Inverted array:");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

    /*-3-
2 массива.
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
    public static void task3() {
        String[] list = new String[10];
        int[] num = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 rows:");
        for (int i = 0; i < 10; i++) {
            list[i] = scan.nextLine();
            num[i] = list[i].length();
        }
        scan.close();

        System.out.println("Numeric array:");
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(num[i]);
        }
    }

    /*-4-
    Массив из чисел в обратном порядке.
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Расположить элементы массива в обратном порядке.
    4. Вывести результат на экран, каждое значение выводить с новой строки.*/
    public static void task4() {
        int[] num = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 nums:");
        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int j = 0; j < num.length / 2; j++) {
            int temp = num[j];
            num[j] = num[num.length - j - 1];
            num[num.length - j - 1] = temp;
        }

        System.out.println("Inverted array:");
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(num[i]);
        }
    }

    /*-5-
    Один большой массив и два маленьких.
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
    public static void task5() {
        int[] num = new int[20];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 20 nums:");
        for (int i = 0; i < 20; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        int[] first = new int[10];
        int[] second = new int[10];

        for (int i = 0; i < num.length / 2; i++) {
            first[i] = num[i];
            second[i] = num[i + 10];
        }

        System.out.println("Second array:");
        for (int i = 0; i <= second.length - 1; i++) {
            System.out.println(second[i]);
        }
    }
}
