import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTasks {
    /*5 различных строчек в списке

    1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки*/
    public static void task7() {
        ArrayList<String> arraysString = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            arraysString.add(RandomStringUtils.random(5, true, false));

        System.out.println(arraysString.size());

        for (int i = 0; i < arraysString.size(); i++)
            System.out.println(arraysString.get(i));
    }

    /*8. Самая длинная строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки.*/
    public static void task8() {
        ArrayList<String> arraysString = new ArrayList<>();

        System.out.println("Enter 5 line:");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arraysString.add(scan.nextLine());
        }

        int size = 0;
        for (int i = 0; i < arraysString.size(); i++){
            if(size<arraysString.get(i).length())
                size = arraysString.get(i).length();
        }

        for (int i = 0; i < arraysString.size(); i++)
            if(arraysString.get(i).length() == size)
                System.out.println(arraysString.get(i));
    }

    /*9. Самая короткая строка

    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую короткую строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки*/
    public static void task9() {
        ArrayList<String> arraysString = new ArrayList<>();

        System.out.println("Enter 5 line:");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arraysString.add(scan.nextLine());
        }

        int size = arraysString.get(0).length();
        for (int i = 0; i < arraysString.size(); i++){
            if(size>arraysString.get(i).length())
                size = arraysString.get(i).length();
        }

        for (int i = 0; i < arraysString.size(); i++)
            if(arraysString.get(i).length() == size)
                System.out.println(arraysString.get(i));
    }

    /*10. 10 строчек в начало списка
    1. Создай список строк в методе main.
    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.*/
    public static void task10() {
        ArrayList<String> arraysString = new ArrayList<>();
        System.out.println("Enter 10 line:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arraysString.add(arraysString.size() - i, scanner.nextLine());
        }

        for (int i = 0; i < arraysString.size(); i++)
            System.out.println(arraysString.get(i));
    }

    /*11. Удали последнюю строку и вставь её в начало
    1. Создай список строк.
    2. Добавь в него 5 строчек с клавиатуры.
    3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
    4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки*/
    public static void task11() {
        ArrayList<String> arraysString = new ArrayList<>();
        System.out.println("Enter 5 line:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arraysString.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String lastLine = arraysString.get(arraysString.size() - 1);
            arraysString.remove(arraysString.size() - 1);
            arraysString.add(0, lastLine);
        }

        for (int i = 0; i < arraysString.size(); i++)
            System.out.println(arraysString.get(i));
    }
}
