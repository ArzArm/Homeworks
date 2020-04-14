public class Admin extends User {
    public static final String USERNAME = "admin";
    protected static String PASSWORD = "admin";

    public Admin() {
        super(USERNAME, PASSWORD);
    }
}
