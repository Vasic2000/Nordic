package HomeTask_03_10;

import java.util.Set;
import java.util.TreeSet;

public class ChildComparator {
    public int compare(Person p1, Person p2)
    {
        return p1.age - p2.age;
    }

    public static void main(String[] args) {
        Set<Person> person2 = new TreeSet<Person>();
    }
}
