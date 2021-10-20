import java.util.Scanner;

public class ReferenceTypes {
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
    }

    /*1. Дана строка. Вывести первый, последний и средний (если он есть) символы.
    Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
    Также предусмотрите вывод количества пробелов.*/
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string with spaces and dots:");
        String line = scan.nextLine();
        scan.close();

        System.out.println("First character: " + line.charAt(0));
        if(line.length()%2 == 0)
            System.out.println("The middle character is missing.");
        else
            System.out.println("Middle character: " + line.charAt(line.length() / 2));
        System.out.println("Last character: " + line.substring(line.length() - 1));

        int firstDot = line.indexOf('.');
        System.out.println("The line before first dot: " + line.substring(0, firstDot + 1));

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.substring(i, i + 1).equals(" ")) {
                count++;
            }
        }
        System.out.println("Count spaces: " + count);
    }

    /*2 Найти в строке указанную подстроку и заменить ее на новую.
    Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string:");
        String line = scan.nextLine();
        System.out.println("Enter some substring for replace:");
        String replacedString = scan.nextLine();
        System.out.println("Enter some new substring:");
        String newSubString = scan.nextLine();
        scan.close();

        line = line.replace(replacedString, newSubString);

        System.out.println("New string is: " + line);
    }

    /*3 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
    public static void task3() {
        System.out.println("Enter some string:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();

        String longestWord = "";

        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}
