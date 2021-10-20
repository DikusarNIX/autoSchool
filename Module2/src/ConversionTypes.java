
public class ConversionTypes {
    public static void main(String[] args) {
        task1(21, 8);
        task2(48);
        task3(22.15);
        task4(0, 2, 5);
    }

    /*1. В переменных q и w хранятся два натуральных числа.
    Создайте программу, выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
    public static void task1(int q, int w) {
        System.out.println(q + " / " + w + " = " + q / w + " with a remainder of " + q % w);
    }

    /*2. В переменной n хранится натуральное двузначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static void task2(int n) {
        int length = String.valueOf(n).length();
        if (length == 2) {
            char firstNumber = String.valueOf(n).charAt(0);
            char secondNumber = String.valueOf(n).charAt(1);
            int sum = Character.getNumericValue(firstNumber) + Character.getNumericValue(secondNumber);
            System.out.println(sum);
        } else {
            System.out.println("Try again");
        }
    }

    /*3. В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/
    public static void task3(double n) {
        System.out.println(Math.round(n));
    }

    /*4. Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
    в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
    Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7. */
    public static void task4(int a, int b, int c) {
        a = a + b; //old value - a-b
        c = c + (a - b) + b; // = c+a, so old value c-a
        b = (c - a) - (a - b);
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
    }
}
