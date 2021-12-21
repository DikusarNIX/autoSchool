import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class HashSetTasks {
    /*1. HashSet из растений

    Создать коллекцию HashSet с типом элементов String.
    Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Посмотреть, как изменился порядок добавленных элементов.*/
    public static void task1() {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("жень-шень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");

        Iterator<String> i = fruits.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    /*2. HashMap из 10 пар

    Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
    груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.

    Пример вывода (тут показана только одна строка):
    картофель – клубень*/
    public static void task2() {
        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("арбуз", "ягода");
        fruits.put("банан", "трава");
        fruits.put("вишня", "ягода");
        fruits.put("груша", "фрукт");
        fruits.put("дыня", "овощ");
        fruits.put("ежевика", "куст");
        fruits.put("жень-шень", "корень");
        fruits.put("земляника", "ягода");
        fruits.put("ирис", "цветок");
        fruits.put("картофель", "клубень");

        for (Map.Entry entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /*Коллекция HashMap из котов

    Есть класс Cat, с полем имя (name, String).
    Создать коллекцию HashMap<String, Cat>.
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.*/
    public static void task3() {
        HashMap<String, Cat> cats = new HashMap<>();

        Cat cat1 = new Cat("Соня");
        Cat cat2 = new Cat("Клеопатра");
        Cat cat3 = new Cat("Гарфилд");
        Cat cat4 = new Cat("Том");
        Cat cat5 = new Cat("Пушок");
        Cat cat6 = new Cat("Кнопка");
        Cat cat7 = new Cat("Масяня");
        Cat cat8 = new Cat("Каспер");
        Cat cat9 = new Cat("Наоми");
        Cat cat10 = new Cat("Персик");

        cats.put(cat1.getName(), cat1);
        cats.put(cat2.getName(), cat2);
        cats.put(cat3.getName(), cat3);
        cats.put(cat4.getName(), cat4);
        cats.put(cat5.getName(), cat5);
        cats.put(cat6.getName(), cat6);
        cats.put(cat7.getName(), cat7);
        cats.put(cat8.getName(), cat8);
        cats.put(cat9.getName(), cat9);
        cats.put(cat10.getName(), cat10);

        for (Map.Entry entry : cats.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /* Вывести на экран список ключей

    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список ключей, каждый элемент с новой строки.*/
    public static void task4() {
        HashMap<String, String> randomMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String key = RandomStringUtils.random(5, true, false);
            String value = RandomStringUtils.random(5, true, false);
            randomMap.put(key, value);
        }

        for (Map.Entry entry : randomMap.entrySet())
            System.out.println(entry.getKey());
    }

    /*Вывести на экран список значений

    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список значений, каждый элемент с новой строки.*/
    public static void task5() {
        HashMap<String, String> randomMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String key = RandomStringUtils.random(5, true, false);
            String value = RandomStringUtils.random(5, true, false);
            randomMap.put(key, value);
        }

        for (Map.Entry entry : randomMap.entrySet())
            System.out.println(entry.getValue());
    }

    /*6. Коллекция HashMap из Object

    Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.

    Пример вывода (тут показана только одна строка):
    Sim - 5*/
    public static void task6() {
        HashMap<String, Object> randomMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            Random randomInt = new Random();
            String key = RandomStringUtils.random(5, true, false);
            Object value = randomInt.nextInt(10);
            randomMap.put(key, value);
        }

        for (Map.Entry entry : randomMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
