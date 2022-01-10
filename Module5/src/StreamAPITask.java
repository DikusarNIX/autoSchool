import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
Добавьте вручную несколько пустых элементов ""

С помощью stream() выведите на консоль:
- длинну каждого из элементов списка.
- не пустые элементы списка не содержащие символ d
- элементы списка в алфавитном порядке.*/
public class StreamAPITask {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");

        String word;
        Random randomInt = new Random();

        while (list.size() < 55) {
            word = RandomStringUtils.random(randomInt.nextInt(10), true, false);
            list.add(word);
        }

        System.out.println(list);
        System.out.println(list.size());

        list.stream().forEach(x->System.out.print(x.length()+" "));
        System.out.println();
        System.out.println(list.stream().filter(x->x.length()>0).filter(x->x.length()>0).filter(x->!x.contains("d")).collect(Collectors.toList()));
        System.out.println(list.stream().sorted((o1,o2)-> o1.toLowerCase().compareTo(o2.toLowerCase())).collect(Collectors.toList()));
    }
}
