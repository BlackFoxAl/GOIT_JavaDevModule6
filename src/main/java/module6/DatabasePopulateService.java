package module6;

import module6.db.UtilQueries;

public class DatabasePopulateService {
    public static void main(String [] args) {
        String filenamePopulate = "sql/populate_db.sql";
        new UtilQueries().executeSetQueries(filenamePopulate);
    }
}
