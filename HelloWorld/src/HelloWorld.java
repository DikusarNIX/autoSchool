import java.util.Scanner;

//Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
//Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
// считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Print your name:");
        System.out.println("Hello, " + printHelloName());
    }

    public static String printHelloName() {
        Scanner scanInput = new Scanner(System.in);
        String name = scanInput.nextLine();
        scanInput.close();
        return name;
    }
}
