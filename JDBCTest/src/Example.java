import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author x1aolata
 * @date 2020/2/26 17:03
 * @script ...
 */
public class Example {

    public void login_Statement() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = in.next();
        System.out.println("请输入密码：");
        String pwd = in.next();


        Connection connection = JDBCUtils.getConnection();

        String sql = "select count(*) from admin where `username` = \"" + username + "\" and `password`=\"" + pwd + "\"";
        Statement statement = connection.createStatement();

        ResultSet set = statement.executeQuery(sql);

        if (set.next()) {
            int count = set.getInt(1);
            System.out.println(count > 0 ? "登陆成功" : "登陆失败");
        }
        JDBCUtils.Close(set, statement, connection);
    }

    public void login_PreparedStatement() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = in.next();
        System.out.println("请输入密码：");
        String pwd = in.next();


        Connection connection = JDBCUtils.getConnection();

        String sql = "select count(*) from admin where `username` = ? and `password`= ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, pwd);

        ResultSet set = statement.executeQuery();

        if (set.next()) {
            int count = set.getInt(1);
            System.out.println(count > 0 ? "登陆成功" : "登陆失败");
        }
        JDBCUtils.Close(set, statement, connection);
    }

    public static void main(String[] args) throws Exception {

        new Example().login_PreparedStatement();
    }
}
