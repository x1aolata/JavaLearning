package Connection;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author x1aolata
 * @date 2020/2/25 18:10
 * @script 最简单的 连接数据库
 */
public class Test1 {
    public static void main(String[] args) throws SQLException {

        // 加载驱动
        DriverManager.registerDriver(new Driver());
        // 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/girls", "root", "x1aolata");
        System.out.println("加载成功");
        // 执行增删改查
        // 编写语句
        String sql = "delete from beauty where id = 9 ";
        sql = "update beauty set name = \"鞠婧祎\"where id = 7";
        sql = "insert into beauty (name, phone, photo, boyfriend_id) value (\"小鞠\",\"10086\",null,23)";
        // 执行
        // 获取执行对象
        Statement statement = connection.createStatement();
        int a = statement.executeUpdate(sql);

        System.out.println(a > 0 ? "操作成功" : "操作失败");

        // 关闭连接
        statement.close();
        connection.close();

    }


}
