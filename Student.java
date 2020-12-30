
public class Student extends Person {

    private int id;
    private int age;
    private String name;
    private String role;
    private int phoneNumber;
    private int hid;

    public int getHid() {
        return this.hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public Student(PersonType personType) {
        super(personType);
    }

    @Override
    public String printPerson() {
        return ("id: " + id + "\tname: " + name + "\tage: " + age + "\tPerson type: " + personType + "\trole: " + role
                + "\tphone number: " + phoneNumber);
    }

    @Override
    public String requestFormPrint() {

        return "id: " + id + "\t name: " + name + "\tis ";
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRole() {
        this.role = "student";

    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void phoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void callrequestDorm(PersonType personType) {
        personType.requestDorm();
    }

}
