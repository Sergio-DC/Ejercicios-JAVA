package db;

import java.sql.Connection;
import java.sql.DriverManager;
import db.Database;

import static db.Database.*;

public interface IDBConnection {
    default Connection connectToDB() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL + DATABASE_NAME, "root", "");
            if(connection != null)
                System.out.println("Se establecio la conexión");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return connection;
        }
    }

}
