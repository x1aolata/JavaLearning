package Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author x1aolata
 * @date 2020/2/25 18:10
 * @script 执行查询语句
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("src//Connection//jdbc.properties"));
//        info.list(System.out);
        String user = info.getProperty("user");
        String password = info.getProperty("password");
        String url = info.getProperty("url");
        String driver = info.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);


        String sql = "select id ,name ,sex from beauty";
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery(sql);
        while (set.next()) {
            System.out.println(set.getString("id") + "\t\t" + set.getString("name") + "\t" + set.getString("sex"));
        }
        set.close();
        statement.close();
        connection.close();
    }
}
