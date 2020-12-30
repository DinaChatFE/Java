public class Local implements PersonType {

    private String type = local;

    @Override
    public String getPersonType() {
        return this.type;
    }

    @Override
    public void requestDorm() {
        System.out.println("\n****************Request failed");
    }

}
