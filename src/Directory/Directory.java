package Directory;

import Employee.EmployeeData;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Directory<T extends EmployeeData> {
    private final LinkedList<T> employeeList;

    public Directory(){
        this.employeeList = new LinkedList<>();
    }

    public List<T> findByExperience(int experience){
        return this.employeeList.stream().filter(e -> Objects.equals(e.getExperience(), experience)).toList();
    }

    public List<String> findPhoneNumberByName(String name) {
        LinkedList<String> phoneNumberList = new LinkedList<>();

        for (T employee : this.employeeList) {
            if (employee.getName().equals(name)) {
                phoneNumberList.add(employee.getPhoneNumber());
            }
        }

        return phoneNumberList;
    }

    public T findByID(long ID){
        for (T employee: this.employeeList){
            if (employee.getID() == ID) return employee;
        }

        return null;
    }

    public void add(T employee){
        if (!this.employeeList.contains(employee)) this.employeeList.add(employee);
    }
}
