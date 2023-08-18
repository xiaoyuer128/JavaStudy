package study230818.demo01;

import com.mysql.cj.jdbc.ConnectionWrapper;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class demo01Class {
    public static void main(String[] args) throws Exception {
       /* Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db8033";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","zxy020304");
        Connection connection = driver.connect(url,properties);
        String sql = "INSERT INTO cqupt2 VALUES (5);";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();*/
        /*Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db8033","root","zxy020304");
        System.out.println(connection);
        connection.close();*/

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\BC(jsj)\\JavaStudy\\StudyWork\\src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String Driver = properties.getProperty("driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
        connection.close();

    }
}
