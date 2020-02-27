import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author x1aolata
 * @date 2020/2/26 20:14
 * @script 事务的例子
 */
public class TCL {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JDBCUtils.getConnection();
            //关闭自动事务
            connection.setAutoCommit(false);

            String sql = "update bank set money = ? where id =?";
            statement = connection.prepareStatement(sql);


            // 小邋遢变为 5000
            statement.setInt(1, 5000);
            statement.setInt(2, 1);
            statement.executeUpdate();


//            int i = 1 / 0;
            // 陆仁变为 15000
            statement.setInt(1, 15000);
            statement.setInt(2, 2);
            statement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
        } finally {
            JDBCUtils.Close(null, statement, connection);
        }


    }
}


/**
 * 普通方法
 */

//public class TCL {
//
//    public static void main(String[] args) throws Exception {
//        Connection connection = JDBCUtils.getConnection();
//
//
//        String sql = "update bank set money = ? where id =?";
//        PreparedStatement statement = connection.prepareStatement(sql);
//
//
//        // 小邋遢变为 5000
//        statement.setInt(1, 5000);
//        statement.setInt(2, 1);
//        statement.executeUpdate();
//
//
//        int i = 1 / 0;
//        // 陆仁变为 15000
//        statement.setInt(1, 15000);
//        statement.setInt(2, 2);
//        statement.executeUpdate();
//
//        JDBCUtils.Close(null,statement,connection);
//
//    }
//}