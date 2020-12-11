package lesson_5;

public class Employees {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employees(String fullName, String position, String email, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "employees{" +
                "fullName = '" + fullName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", salary = " + salary +
                ", age = " + age +
                '}';
    }
}
