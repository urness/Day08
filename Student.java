public class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void speak() {
        System.out.println("Hi, I am student " + getName() + " and my ID is " + studentId + ".");
    }

    public void study() {
        System.out.println(getName() + " is studying Java inheritance.");
    }
}
