// Demo program to show inheritance in action.
public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rex"),
            new Cat("Whiskers"),
            new Dog("Buddy")
        };

        // Even though the array is type Animal,
        // each object uses its own overridden makeSound() method.
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
