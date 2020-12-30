
public class Foreigner implements PersonType {

    private String type = foreigner;

    @Override
    public String getPersonType() {
        return this.type;
    }

    public void RequestDorm(Person person) {
        System.out.print(person.requestFormPrint());
        if (person.personType != this.type) {
            System.out.println("not be able to request");
        } else {
            System.out.println("reqested successfully");
        }
    }

    @Override
    public void requestDorm() {
        System.out.println("\n-----------Request successfully");
    }

}