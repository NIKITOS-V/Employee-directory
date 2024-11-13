package Employee;

import java.util.Objects;

public class Employee implements EmployeeData{
    private String name;
    private String phoneNumber;
    private long ID;
    private int experience;

    public Employee(long ID, String name, String phoneNumber, int experience){
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public long getID() {
        return ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return this.ID == (employee.getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.ID,
                this.name,
                this.phoneNumber,
                this.experience
        );
    }

    @Override
    public String toString() {
        return String.format(
                "\nID: %d\nName: %s\nPhone number: %s\nExperience: %d\n",
                this.ID,
                this.name,
                this.name,
                this.experience
        );
    }
}
