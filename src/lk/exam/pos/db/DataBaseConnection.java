package lk.exam.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @auther Praneeth Geethanjana <geethanjana10@gmail.com>
 * @Since 10/9/2021
 */
public class DataBaseConnection {
    private static lk.exam.pos.db.DataBaseConnection dataBaseConnection;
    private Connection connection;


    private DataBaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Thogakade",
                "root","ijse"
        );

    }

    public static lk.exam.pos.db.DataBaseConnection getInstance() throws SQLException, ClassNotFoundException {
        if(dataBaseConnection ==null){
            dataBaseConnection=new lk.exam.pos.db.DataBaseConnection();
        }
        return dataBaseConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
