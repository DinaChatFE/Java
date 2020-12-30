public class Login {
    public Person loginPerson(Person person, int id, String name) {
        person.setID(id);
        person.setName(name);
        person.setRole();
        return person;
    }

    public void printLoginPerson(Person person) {
        System.out.println(person.printPerson());
    }
}
