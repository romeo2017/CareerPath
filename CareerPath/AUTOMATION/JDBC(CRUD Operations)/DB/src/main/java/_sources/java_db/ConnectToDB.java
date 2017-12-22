package _sources.java_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {

    private static final String DATABASE_URL ="jdbc:mysql://localhost:3306/automation_practice?autoReconnect=true&useSSL=false";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="Java_Sql_Testing2017";

    Connection connection;

    public void dbConnect() throws SQLException {

        try {
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            //System.out.println("Connection Successfully Started!");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
    }

    public void dbClose(){
        try {
            connection.close();
            System.out.println("Connection Successfully Closed!");
        } catch (SQLException e){
                e.printStackTrace();
            }

    }

}


