package _sources.java_db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
    private static final String SQL_SELEC_QUERY ="SELECT * FROM Sales";

    public void selectQuery() throws Throwable{

        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.dbConnect();

        Connection connection = connectToDB.connection;
        Statement statement = connection.createStatement();

        ResultSet result = statement.executeQuery(SQL_SELEC_QUERY);
        System.out.println("  Run Select Query ... ");

        String resultStr = "";

        try {
            int ncol = result.getMetaData().getColumnCount(); // get table column count
            for (int i = 1; i <= ncol; i++) { // iterate from 1 to column count
                resultStr += result.getMetaData().getColumnName(i) + " "; // read each table column name
            }

            resultStr += "\n";// append a new line to the result string

            while (result.next()) { // when there is a row next, do the loop
                for (int i = 1; i <= ncol; i++) {
                    String currCol = result.getString(i) + "             "; // read the cell at position i and append a space to it.
                    resultStr += currCol; // append the cell to the result string
                }
                resultStr += "\n"; // create a new line
            }

            result.last();// move the cursor to the last row.

            int nrow = result.getRow(); // get row count
            resultStr += "The total number of rows is " + nrow + "\n"; // write row size into result

            JOptionPane.showMessageDialog(null, resultStr, "Output result!", 1); // display the result in a message box

        } catch (SQLException ex) {
            System.out.println("Error here!");
        }

        connectToDB.dbClose();
    }

}
