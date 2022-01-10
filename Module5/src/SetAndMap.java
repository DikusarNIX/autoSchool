import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class SetAndMap {
    /*Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».*/
    public static void task12() {
        Set<String> lSet = new HashSet<>();
        String word;

        while (lSet.size() < 20) {
            word = RandomStringUtils.random(5, true, false);
            if (word.toLowerCase().startsWith("l"))
                lSet.add(word);
        }

        System.out.println(lSet);
    }

    /*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    Удалить из множества все числа больше 10.*/
    public static void task13() {
        Set<Integer> intSet = new HashSet<>();
        Random random = new Random();
        while (intSet.size() < 20)
            intSet.add(random.nextInt(30));
        System.out.println(intSet);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item > 10)
                iterator.remove();
        }

        System.out.println(intSet);
    }

    /*Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    Проверить сколько людей имеют совпадающие с заданным имя или фамилию.*/
    public static void task14() {
        Map<String, String> people = new HashMap<>();

        people.put("Смирнов", "Алексей");
        people.put("Морозов", "Николай");
        people.put("Иванов", "Николай");
        people.put("Соколов", "Михаил");
        people.put("Петров", "Семен");
        people.put("Сидоров", "Максим");
        people.put("Михеев", "Сергей");
        people.put("Орехов", "Николай");
        people.put("Титов", "Михаил");
        people.put("Ильин", "Алексей");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last name");
        String lastName = scan.nextLine();
        System.out.println("Enter first name");
        String firstName = scan.nextLine();

        int countName = 0;
        Iterator<Map.Entry<String, String>> iter = people.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (entry.getValue().equalsIgnoreCase(firstName) || entry.getKey().equalsIgnoreCase(lastName))
                countName += 1;
        }

        System.out.println("Name count in the map: " + countName);
    }

    //Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
    //Удалить из словаря всех людей, родившихся летом.
    public static void task15() {
        Map<String, LocalDate> people = new HashMap<>();

        LocalDate start = LocalDate.of(1970, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(start, LocalDate.now());

        people.put("Смирнов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Морозов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Иванов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Соколов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Петров", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Сидоров", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Михеев", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Орехов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Титов", start.plusDays(new Random().nextInt((int) days + 1)));
        people.put("Ильин", start.plusDays(new Random().nextInt((int) days + 1)));

        System.out.println(people);

        Iterator<Map.Entry<String, LocalDate>> iter = people.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, LocalDate> entry = iter.next();
            if (entry.getValue().getMonthValue() >= 6 && entry.getValue().getMonthValue() <= 8) {
                iter.remove();
            }
        }

        System.out.println(people);
    }

    //Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
    // Удалить людей, имеющих одинаковые имена.
    public static void task16() {
        Map<String, String> people = new HashMap<>();

        people.put("Смирнов", "Алексей");
        people.put("Морозов", "Николай");
        people.put("Иванов", "Николай");
        people.put("Соколов", "Михаил");
        people.put("Петров", "Семен");
        people.put("Сидоров", "Максим");
        people.put("Михеев", "Сергей");
        people.put("Орехов", "Николай");
        people.put("Титов", "Михаил");
        people.put("Ильин", "Алексей");

        Set<String> uniqueNames = new HashSet<>();
        people = people.entrySet().stream().filter(entry -> uniqueNames.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(people);
    }

    /*1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
    2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
    4. Вывести содержимое Map на экран.*/
    public static void task17() {
        Map<String, String> people = new HashMap<>();

        people.put("Смирнов", "Алексей");
        people.put("Морозов", "Николай");
        people.put("Иванов", "Николай");
        people.put("Соколов", "Михаил");
        people.put("Орехов", "Семен");
        people.put("Сидоров", "Максим");
        people.put("Михеев", "Сергей");
        people.put("Орехов", "Николай");
        people.put("Титов", "Михаил");
        people.put("Ильин", "Алексей");

        //The key is unique
        System.out.println(people);
    }
}
