/*Given a list of employee records, each containing an ID, name,salary,and department,
how can we remove duplicate entries based on the combination of salary and department?
The goal is to retain only the first occurrence of each unique combination of salary
and department, ensuring that records with the same salary and department are treated
as duplicates*/
import java.util.*;
public class Main {
    //mETHOD TO REMOVE THE RECORD WITH SAME SALARY AND DEPARTMENT
    private static List<Employee> removeDuplicateSalariesAndDept(List<Employee> employees) {
        //To store the unique salaty and dept
        Map<String, Boolean> uniqueKeyMap = new HashMap<>();
        //travese the list
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            //creating the key using unique salary and dept
            String key = employee.getSalary() + "-" + employee.getDepartment();
            // Remove the record if a record with the same salary and department is already present
            if (uniqueKeyMap.containsKey(key)) {
                iterator.remove();
            } else {
                //adding unique elements to the list
                uniqueKeyMap.put(key, true);
            }
        }

        return employees;
    }

    public static void main(String[] args) {
        //creating the list of employees,arraylist used because it can store the duplicate elements
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 5000, "HR"));
        employees.add(new Employee(1, "Adam", 5000, "IT"));
        employees.add(new Employee(2, "Sam", 6000, "IT"));
        employees.add(new Employee(2, "Ram", 6000, "IT"));
        employees.add(new Employee(3, "David", 6000, "IT"));
        employees.add(new Employee(4, "Chris", 7000, "IT"));

        //call the method to remove the duplicates
        List<Employee> uniqueEmployees = removeDuplicateSalariesAndDept(employees);
        //print the unique employees
        for (Employee employee : uniqueEmployees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
