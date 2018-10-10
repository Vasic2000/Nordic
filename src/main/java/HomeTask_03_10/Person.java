package HomeTask_03_10;

public class Person implements Comparable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public int compareTo(Object o) {
        return this.age != ((Person) o).age ? this.age - ((Person) o).age : this.name.compareTo(((Person) o).name);
    }
}
