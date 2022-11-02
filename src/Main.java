import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> treeSet = new ArrayList<>();

        treeSet.add(new Person("Владимир", "Донсков", 63));
        treeSet.add(new Person("Дмитрий", "Мамин-Сибиряк", 45));
        treeSet.add(new Person("Андрей", "Михалков Иванов Петров", 35));
        treeSet.add(new Person("Михаил", "Салтыков-Щедрин", 40));
        treeSet.add(new Person("Николай", "Карманов", 35));
        System.out.println(treeSet);

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] sur1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] sur2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int result = (sur1.length >= 2 && sur2.length >= 2) ? 0 : Integer.compare(sur1.length, sur2.length);
            return result == 0 ? o1.compareTo(o2) : result;
        };

        Collections.sort(treeSet, comparator);
        System.out.println(treeSet);
    }
}
