package _sources.java_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
    private static final String SQL_DELETE_QUERY ="DELETE FROM Sales WHERE UnitPrice > 1000";

    public void setSqlDeleteQuery() throws Throwable{

        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.dbConnect();

        Connection connection = connectToDB.connection;
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_QUERY);

        try{
            preparedStatement.execute();
            System.out.println(" Run Delete Query ...");

        } catch (SQLException ex) {
            System.out.println("Error here!");
        }

        connectToDB.dbClose();
    }
}
