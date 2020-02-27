import com.alibaba.druid.pool.DruidDataSourceFactory;
import jdk.nashorn.internal.runtime.ECMAException;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author x1aolata
 * @date 2020/2/27 20:26
 * @script 德鲁伊连接池的演示
 */
public class DruidTest {


    public static void test() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src//druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        Connection connection = dataSource.getConnection();

        String sql = "select id ,name ,sex from beauty";
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery(sql);
        while (set.next()) {
            System.out.println(set.getString("id") + "\t\t" + set.getString("name") + "\t" + set.getString("sex"));
        }

    }

    public static void main(String[] args) throws Exception {
        test();
    }
}
