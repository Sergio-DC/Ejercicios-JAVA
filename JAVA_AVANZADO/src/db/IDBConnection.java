package db;

import java.sql.Connection;
import java.sql.DriverManager;
import db.Database;

import static db.Database.*;

public interface IDBConnection {
    default Connection connectToDB() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL + DATABASE_NAME);
        } catch (Exception e) {

        } finally {

        }
    }

}
