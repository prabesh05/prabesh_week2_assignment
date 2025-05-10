/*Simple Class with a Method Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age.
In the main method, create a Student object and call displayInfo(). */

public class Student{

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        }
        public void displayInfo() {
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
        }
        public static void main(String[] args) {
            Student std1 = new Student("Jon",22);

            std1.displayInfo();
        }
}