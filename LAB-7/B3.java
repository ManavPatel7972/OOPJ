// import java.util.*;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void printEmployeeDetails() {
        printInfo();
        System.out.println("Specialization: " + specialization);
        printSalary();
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void printManagerDetails() {
        printInfo();
        System.out.println("Department: " + department);
        printSalary();
        System.out.println();
    }
}

public class B3 {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Alice", 28, "9876543210", "New York", 50000.0, "Software Development");

        Manager mgr = new Manager("Bob", 35, "9123456789", "San Francisco", 75000.0, "IT Management");

        System.out.println("Employee Details:");
        emp.printEmployeeDetails();

        System.out.println("Manager Details:");
        mgr.printManagerDetails();
    }
}
