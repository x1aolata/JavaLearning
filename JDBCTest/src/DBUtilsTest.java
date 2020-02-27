import com.alibaba.druid.util.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/**
 * @author x1aolata
 * @date 2020/2/27 22:05
 * @script DBUtils的使用
 */
public class DBUtilsTest {

    public static void testUpdate() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        int update = queryRunner.update(connection, "update boys set boyname=? where id = 4", "小邋遢");

        connection.close();
    }

    public static void testQuery() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        QueryRunner queryRunner = new QueryRunner();

////        查询单行数据
//        Admin admin = queryRunner.query(connection, "select * from admin where id = ? ", new BeanHandler<>(Admin.class), 3);
//        System.out.println(admin);

////        查询多行数据
//        List<Admin> admins = queryRunner.query(connection, "select * from admin where id < ? ", new BeanListHandler<>(Admin.class), 10);
//
//        for (Admin a :
//                admins) {
//            System.out.println(a);
//
//        }

//        查询单个值
        Object query = queryRunner.query(connection, "select count(*) from admin  ", new ScalarHandler());
        System.out.println(query);


        connection.close();
    }

    public static void main(String[] args) throws Exception {
        testQuery();
    }
}
