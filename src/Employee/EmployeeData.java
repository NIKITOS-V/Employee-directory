package Employee;

public interface EmployeeData {
    String getName();
    int getExperience();
    long getID();
    String getPhoneNumber();
    void setName(String name);
    void setID(long ID);
    void setPhoneNumber(String phoneNumber);
    void setExperience(int experience);
}
