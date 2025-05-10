/*Student Grading (Switch Statement) Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch 
or if-else ladder. Create 3 students and display their grades. */


public class Student {
    public String name;
    public float marks;

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public String grade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if(marks>=60) {
            return "D";
        } else if(marks >=50) {
            return "E" ;
        } else {
            return "F";
        }
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());

    }


    public static void main(String[] args) {
        Student s1 = new Student("Jon", 92);
        Student s2 = new Student("Daneyeres", 76);
        Student s3 = new Student("Eddard",40);

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
