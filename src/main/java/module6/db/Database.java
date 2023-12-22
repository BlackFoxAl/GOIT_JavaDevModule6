package module6.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Database {
    private static final String DB_URL = "jdbc:h2:./test";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static Database instance;
    private static Connection connection;
    private Database() throws SQLException {
         connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
    }

    public static Database getInstance() throws SQLException {
        if(Objects.isNull(instance)){
            instance = new Database();
        }
        return instance;
    }

    public static Connection getConnection() {
       return connection;
    }
    public void close() throws SQLException{
        connection.close();
    }
}
