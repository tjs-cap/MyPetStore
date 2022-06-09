import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Spot",2,"Mongrel",true);
        d1.growOlder();
        d1.eats();
        d1.makeSound();
        System.out.println(d1.getName() + " is " + d1.getAge() + " years old!");

        Cat c1 = new Cat("Freda", 2, "Moggy", 2);
        c1.growOlder();
        c1.makeSound();
        System.out.println(c1.getName() + " is " + c1.getAge() + " years old!");

        Mouse m1 = new Mouse("Jerry",5,"small");
        m1.growOlder();
        m1.makeSound();

    }
}