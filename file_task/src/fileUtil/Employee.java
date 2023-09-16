package fileUtil;

import java.io.Serializable;

public class Employee implements Serializable { // Obyektimizin heyat tapmasi uchun Serializable edirik..

    public static final long serialVersionUID = 1231135L; // version UID ni ozumuz veririkse
    // hec vaxt deyishmir ve bu deyerde saxlanilir.
    String name;
    String surname;
    double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
