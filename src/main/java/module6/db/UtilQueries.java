package module6.db;

import module6.utilfile.ParseSQLFile;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UtilQueries {
    public UtilQueries(String filePath) {
        List<String> queries = new ParseSQLFile(filePath).getListSQLQuery();
        try {
            Connection connection = Database.getInstance().getConnection();
            Statement statement = connection.createStatement();
            for (String query : queries) {
                statement.executeUpdate(query);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
