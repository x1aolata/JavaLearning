import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author x1aolata
 * @date 2020/2/26 20:28
 * @script 批处理的例子
 */
public class Batch {
    /**
     * 不使用批处理
     */
    public static void test() throws SQLException {
        Connection connection = JDBCUtils.getConnection();

        PreparedStatement statement = connection.prepareStatement("insert into admin values(null,?,?)");


        for (int i = 0; i < 50000; i++) {

            statement.setString(1, "Amy" + i);
            statement.setString(2, "0000");
            statement.executeUpdate();

        }
        JDBCUtils.Close(null, statement, connection);
    }

    /**
     * 不使用批处理
     */
    public static void test_Batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();

        PreparedStatement statement = connection.prepareStatement("insert into admin values(null,?,?)");


        for (int i = 1; i <= 50000; i++) {

            statement.setString(1, "Amy" + i);
            statement.setString(2, "0000");

            statement.addBatch();
            if (i % 1000 == 0) {
                statement.executeBatch();
                statement.clearBatch();
            }


        }
        JDBCUtils.Close(null, statement, connection);
    }

    public static void main(String[] args) throws SQLException {
        test_Batch();
    }
}
