// Subclass: Cat
// Cat also inherits from Animal.
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    // Cat provides its own version of makeSound().
    public void makeSound() {
        System.out.println(getName() + " says: meow!");
    }
}
