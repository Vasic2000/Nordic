package HomeTask_26_09;

public class Parent {
    int age;
    String name;
    int socialStatus;

    public Parent(String name) {
        this.age = 0;
        this.name = name;
        this.socialStatus = 0;
    }

    public Parent(int age, String name, int socialStatus) {
        this.age = age;
        this.name = name;
        this.socialStatus = socialStatus;
    }

    public void statusPrint() {
        System.out.println("Социальный статус = " + socialStatus);
    }

    public void description() {
        System.out.println("Имя     : " + name);
        System.out.println("Возраст : " + age);
    }
}
