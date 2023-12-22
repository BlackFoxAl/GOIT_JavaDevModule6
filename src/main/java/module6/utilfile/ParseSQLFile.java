package module6.utilfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParseSQLFile {
    private String filePath;

    public static List<String> sqlQueries;
    private String sqlQuery;
    String delimiter = ";";
    public ParseSQLFile(String filePath){
        this.filePath = filePath;
    }
    public List<String> getListSQLQuery() {
        try {
            sqlQueries = Arrays.stream(Files.lines(Paths.get(filePath))
                            .collect(Collectors.joining(""))
                            .split(delimiter))
                    .toList();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sqlQueries;
    }
    public String getOneSqlQuery() {
        try {
            sqlQuery = String.join(
                    "\n",
                    Files.readAllLines(Paths.get(filePath))
            );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sqlQuery;
    }
}
