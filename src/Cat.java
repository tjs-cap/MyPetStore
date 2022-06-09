public class Cat extends Animal {
    String breed;
    int jumpHeight = 2;

    public Cat(String name, int age, String breed, int jumpHeight) {
        super(name, age);
        this.breed = breed;
        this.jumpHeight = jumpHeight;
    }

    public void makeSound(){
        System.out.println(getName() + " Meow!");
    }

    public String getBreed() {
        return breed;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
