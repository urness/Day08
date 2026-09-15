public class InheritanceDemo {
    public static void main(String[] args) {
        Person person = new Person("Alex");
        Student student = new Student("Taylor", 101);

        person.speak();
        student.speak();
        student.study();

        System.out.println("Student is a Person: " + (student instanceof Person));
    }
}
