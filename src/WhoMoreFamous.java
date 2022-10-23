import java.util.Comparator;

public class WhoMoreFamous implements Comparator<Person> {
    private static int max;

    public WhoMoreFamous(int max) {
        this.max = max;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] sur1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] sur2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        int result = (sur1.length >= max && sur2.length >= max) ? 0 : Integer.compare(sur1.length, sur2.length);
        return result == 0 ? o1.compareTo(o2) : result;
    }
}
