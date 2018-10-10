package HomeTask_26_09;

public class Child extends Parent {
    int toys;
    int volume;

    public Child(int age, String name, int socialStatus) {
        super(age, name, socialStatus);
        this.volume = 50;
        this.toys = 10;
    }

    public Child(String name, int age, int volume) {
        super(name);
        this.volume = volume;
        this.age = age;
        this.toys = 10;
        this.socialStatus = 50;
    }

    public void volumePrint() {
        System.out.println("Громкость ребёнка : " + volume);
    }

    @Override
    public void description() {
        System.out.println("Имя    : " + name);
        System.out.println("Возраст: " + age);
    }
}
