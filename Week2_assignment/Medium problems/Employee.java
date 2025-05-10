/*Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():

If experience > 5 years, bonus = 20% of salary

Otherwise, bonus = 10% of salary Display the bonus amount for each employee.

 */

public class Employee{
    public String name;
    public  float salary;
    public float yearsOfExperience;

    public Employee(String name, float salary,float exp){
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = exp; 
    }
    public void calculateBonus() {
        if(yearsOfExperience>5) {
            float bonus = salary*0.2f;
            System.out.println("Bonus:"+bonus);

        } else {
            float bonus = salary*0.1f;
            System.out.println("Bonus:"+bonus);
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Eminem",2000,15);
        Employee emp2 = new Employee("Slim Shady",300000,10);
        Employee emp3 = new Employee("Marshall Mathers",2000000,4);
        emp1.calculateBonus();
        emp2.calculateBonus();
        emp3.calculateBonus();
    }
}