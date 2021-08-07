package lk.ijse.customer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class DBConnection {
        private static DBConnection dbConnection;
        private Connection connection;

        private DBConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        }

        public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
            if(dbConnection == null){
                dbConnection=new DBConnection();
            }
            return dbConnection;
        }

        public Connection getConnection(){
            return connection;
        }
}
