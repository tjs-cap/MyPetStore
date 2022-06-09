public class Dog extends Animal implements catchBall, catchFrizbee{
    String breed;
    Boolean Tail;

    public Dog(String name, int age, String breed, Boolean tail) {
        super(name, age);
        this.breed = breed;
        Tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public Boolean getTail() {
        return Tail;
    }

    public void setTail(Boolean tail) {
        Tail = tail;
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " goes Woof!");
    }

    @Override
    public void catchObject() {
        catchBall.super.catchObject();
    }
}
