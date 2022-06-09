
public abstract class Animal {
     private String name;
     private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growOlder(){
        age++;
        System.out.println(name + " is " + age + " years old!");
    }

    public abstract void makeSound();

    public void eats(){
        System.out.println(name + " eats!");
    }
}
