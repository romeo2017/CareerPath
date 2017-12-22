package _sources.java_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuery {
    private static final String SQL_INSERT_QUERY ="INSERT INTO Sales " +
            "(SalesOrderID,SalesOrderDetailID,OrderQty,ProductID,UnitPrice,UnitPriceDiscount,rowguid,ModifiedDate)" +
            "  VALUES (26280,110567,1,905,140.90,0.00,'3','2008-06-01 00:00:00.000')";

    public void setSqlInsertQuery() throws Throwable{

        ConnectToDB connectToDB = new ConnectToDB();
        connectToDB.dbConnect();

        Connection connection = connectToDB.connection;
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_QUERY);

        try{
            preparedStatement.execute();
            System.out.println(" Run Insert Query ...");

        } catch (SQLException ex) {
            System.out.println("Error here!");
        }

        connectToDB.dbClose();
    }
}
