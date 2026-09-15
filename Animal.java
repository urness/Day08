// Base class: Animal
// This is the parent class.
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // This method can be overridden by subclasses.
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
