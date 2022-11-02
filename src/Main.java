import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> treeSet = new ArrayList<>();

        treeSet.add(new Person("Владимир", "Донсков", 63));
        treeSet.add(new Person("Дмитрий", "Мамин-Сибиряк", 45));
        treeSet.add(new Person("Андрей", "Михалков Иванов Петров", 13));
        treeSet.add(new Person("Михаил", "Салтыков-Щедрин", 40));
        treeSet.add(new Person("Николай", "Карманов", 16));
        System.out.println(treeSet);

        Collections.sort(treeSet, new WhoMoreFamous(3));
        System.out.println(treeSet);
        Collections.sort(treeSet, new WhoMoreFamous(2));
        System.out.println(treeSet);

        Predicate<Person> younger18 = (person) -> (person.getAge() < 18) ? true : false ;
        treeSet.removeIf(younger18);
        System.out.println("Удалили всех, кто младше 18: " + treeSet);
    }
}
