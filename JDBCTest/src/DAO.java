import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author x1aolata
 * @date 2020/2/27 23:06
 * @script 基础操作类
 */
public class DAO<T> {


    /**
     * 增删改
     *
     * @param sql
     * @param params
     * @return
     */
    public int update(String sql, Object... params) {
        Connection connection = null;

        try {
            connection = JDBCUtils.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            int update = queryRunner.update(connection, sql, params);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.Close(null, null, connection);
        }
    }

    /**
     * 查询单行值
     *
     * @param sql
     * @param tClass
     * @param params
     * @param <T>
     * @return
     */
    public T querySingle(String sql, Class<T> tClass, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            return queryRunner.query(connection, sql, new BeanHandler<>(tClass), params);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.Close(null, null, connection);
        }
    }


    /**
     * 查询多行值
     *
     * @param sql
     * @param tClass
     * @param params
     * @param <T>
     * @return
     */
    public List<T> queryMulti(String sql, Class<T> tClass, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            return queryRunner.query(connection, sql, new BeanListHandler<>(tClass), params);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.Close(null, null, connection);
        }
    }

    /**
     * 查询单个值
     *
     * @param sql
     * @param params
     * @return
     */
    public Object queryScalar(String sql, Object... params) {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            return queryRunner.query(connection, sql, new ScalarHandler(), params);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.Close(null, null, connection);
        }
    }
}
