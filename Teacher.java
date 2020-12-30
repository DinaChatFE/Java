public class Teacher extends Person {

    private int id;
    private String name;
    private String role;
    private int age;
    private int phoneNumber;

    public Teacher(PersonType personType) {
        super(personType);
    }

    @Override
    public String printPerson() {
        return ("id: " + id + "\tname: " + name + "\tage: " + age + "\tPerson type: " + personType + "\trole: " + role
                + "\tphone number: " + phoneNumber);
    }

    @Override
    public String requestFormPrint() {

        return "id: " + id + "\t name: " + name + "\tis\t";
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
        this.role = "teacher";

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
