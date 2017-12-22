package _sources.java_db;

import java.sql.*;

public class UpdateQuery {
    private static final String SQL_UPDATE_QUERY ="UPDATE Sales SET UnitPrice=UnitPrice*2";

    public void setSqlUpdateQuery() throws Throwable{

        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.dbConnect();

        Connection connection = connectToDB.connection;
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_QUERY);

        try{
            preparedStatement.execute();
            System.out.println(" Run Update Query ...");

        } catch (SQLException ex) {
            System.out.println("Error here!");
        }

        connectToDB.dbClose();
    }
}
