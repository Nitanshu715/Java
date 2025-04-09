import java.util.ArrayList;
import java.util.Iterator;

public class employee2 {
    private String name;
    private int id;
    private double salary;

    public employee2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }

    public static void main(String[] args) {
        ArrayList<employee2> employees = new ArrayList<>();
        employees.add(new employee2("Nitanshu1", 1, 50000));
        employees.add(new employee2("Nitanshu2", 2, 60000));
        employees.add(new employee2("Nitanshu3", 3, 70000));

        // Update salary of Nitanshu2 (ID = 2)
        for (employee2 emp : employees) {
            if (emp.getId() == 2) {
                emp.setSalary(65000);
                break;
            }
        }

        // Remove employee with ID = 1 (Nitanshu1)
        Iterator<employee2> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == 1) {
                iterator.remove();
            }
        }

        // Print remaining employees
        for (employee2 emp : employees) {
            System.out.println(emp);
        }
    }
}
