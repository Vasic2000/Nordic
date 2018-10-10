package HomeTask_26_09;

public class Main {
    public static void main(String[] args) {
        Parent parent1 = new Parent(40, "Denis", 98);
        Child child1 = new Child("Dar'ya", 10, 100);

        System.out.println("Родитель:");
        parent1.description();

        System.out.println("Потомок:");
        child1.description();
        child1.volumePrint();
    }
}
