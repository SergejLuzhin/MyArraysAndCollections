import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println(o1.getAge() - o2.getAge());
        return o1.getAge() - o2.getAge();
    }
}
