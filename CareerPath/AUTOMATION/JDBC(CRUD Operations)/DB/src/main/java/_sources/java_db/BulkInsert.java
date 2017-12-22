package _sources.java_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BulkInsert {

    private static final String SQL_BULK_INSERT_QUERY ="load data local infile 'C:/CSV/CSVfile1.csv' INTO TABLE Sales FIELDS TERMINATED BY ',' LINES TERMINATED BY '\\r\\n';";

    public void setSqlBulkInsertQuery() throws Throwable{

        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.dbConnect();

        Connection connection = connectToDB.connection;
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_BULK_INSERT_QUERY);

        try{
            preparedStatement.execute();
            System.out.println(" Run Bulk Insert Query ...");

        } catch (SQLException ex) {
            System.out.println("Error here!");
        }

        connectToDB.dbClose();
    }
}
