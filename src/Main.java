import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(treeSet, new WhoMoreFamous(3));
        System.out.println(treeSet);
        Collections.sort(treeSet, new WhoMoreFamous(2));
        System.out.println(treeSet);
    }
}
