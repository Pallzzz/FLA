package singleton;

public class DatabaseConnection {

	private static DatabaseConnection instance;
    private String data;

    private DatabaseConnection() {
        this.data = "Simulated database connection";
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
