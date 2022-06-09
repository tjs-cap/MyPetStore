public class Mouse extends Animal{
    String size;

    public Mouse(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Squeaks!");
    }
}
