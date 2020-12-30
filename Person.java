public abstract class Person {

    public String personType;

    public PersonType persontype;

    public Person(PersonType personType) {
        this.personType = personType.getPersonType();
    }

    // public abstract Homework ViewHomework();

    public abstract String printPerson();

    public abstract String requestFormPrint();

    public abstract void setID(int id);

    public abstract void setName(String name);

    public abstract void setRole();

    public abstract void setAge(int age);

    public abstract void phoneNumber(int phoneNumber);

    public abstract void callrequestDorm(PersonType personType);
}