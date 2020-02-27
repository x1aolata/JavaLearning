import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author x1aolata
 * @date 2020/2/26 16:55
 * @script JDBC工具类 封装JDBC连接的工具
 * 1. 获取连接
 * 2. 释放资源
 */
public class JDBCUtils {

    static String user;
    static String password;
    static String url;
    static String driver;

    static {
        try {
            Properties info = new Properties();
            info.load(new FileInputStream("src//jdbc.properties"));
            user = info.getProperty("user");
            password = info.getProperty("password");
            url = info.getProperty("url");
            driver = info.getProperty("driver");

//        Class.forName(driver);
        } catch (Exception e) {

        }
    }

    /**
     * 获取可用的连接对象
     *
     * @return 连接对象
     * @throws Exception
     */
    public static Connection getConnection() {
        // 连接数据库
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void Close(ResultSet set, Statement statement, Connection connection) {
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
          throw   new RuntimeException(e);
        }
    }
}
