import java.util.Objects;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String postcode;

    public Person(String firstName, String lastName, int age, String postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.postcode = postcode;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int age() {
        return age;
    }

    public String postcode() {
        return postcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                this.age == that.age &&
                Objects.equals(this.postcode, that.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, postcode);
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName=" + firstName + ", " +
                "lastName=" + lastName + ", " +
                "age=" + age + ", " +
                "postcode=" + postcode + ']';
    }

}
