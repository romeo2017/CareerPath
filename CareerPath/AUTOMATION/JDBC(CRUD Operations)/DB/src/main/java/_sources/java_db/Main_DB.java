package _sources.java_db;

public class Main_DB {
   public static void main(String[] args) throws Throwable {

      SelectQuery selectQuery = new SelectQuery();
      selectQuery.selectQuery();

      UpdateQuery updateQuery = new UpdateQuery();
      updateQuery.setSqlUpdateQuery();

      DeleteQuery deleteQuery = new DeleteQuery();
      deleteQuery.setSqlDeleteQuery();

      InsertQuery insertQuery = new InsertQuery();
      insertQuery.setSqlInsertQuery();

      BulkInsert bulkInsert = new BulkInsert();
      bulkInsert.setSqlBulkInsertQuery();

   }

}