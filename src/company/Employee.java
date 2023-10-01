package company;

public class Employee {
    private String FullName;
    private String positionAtWork;
    private String email;
    private String phone;
    private int age;
    public Employee(String FullName, String positionAtWork, String email, String phone, int age){
        this.FullName = FullName;
        this.positionAtWork = positionAtWork;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public void setPositionAtWork(String positionAtWork) {
        this.positionAtWork = positionAtWork;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
