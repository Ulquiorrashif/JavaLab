package Lab1;

public class Start {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Ball d2 = new Ball();
        Book d3 = new Book(64,"Введение джава");
        System.out.println(d1);
        d1.intoHumanAge();
        d2.Move();
        System.out.println(d3.getName());
    }
}
