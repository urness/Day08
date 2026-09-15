// Subclass: Dog
// Dog inherits from Animal.
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    // Dog provides its own version of makeSound().
    public void makeSound() {
        System.out.println(getName() + " says: woof woof!");
    }
}
