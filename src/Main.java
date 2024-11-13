import Directory.Directory;
import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        long lastID = 0;

        Directory<Employee> directory = new Directory<Employee>();

        directory.add(new Employee(lastID++, "Name1", "Number1", 1));
        directory.add(new Employee(lastID++, "Name2", "Number2", 3));
        directory.add(new Employee(lastID++, "Name1", "Number3", 5));
        directory.add(new Employee(lastID++, "Name4", "Number4", 5));

        System.out.println(directory.findByExperience(5));
        System.out.println(directory.findByID(0));
        System.out.println(directory.findPhoneNumberByName("Name1"));
    }
}