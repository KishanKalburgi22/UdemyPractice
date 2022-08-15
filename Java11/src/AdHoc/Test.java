package AdHoc;

import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("kk", 1000));
        emps.add(new Employee("kk", 2000));
        Set<Employee> result = emps.stream().filter(e -> e.getSalary() > 50).collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Employee::getName))));
        System.out.println(result);
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "AdHoc.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
