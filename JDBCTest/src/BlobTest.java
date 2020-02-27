import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.zip.InflaterInputStream;

/**
 * @author x1aolata
 * @date 2020/2/27 19:13
 * @script 演示Blob类型的存取
 */
public class BlobTest {


    // 存照片
    public static void save_Blob() throws Exception {

        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = connection.prepareStatement("update beauty set photo = ? where id = 7");
        statement.setBlob(1, new FileInputStream("src//xiaoju3.jpg"));

        statement.executeUpdate();
        JDBCUtils.Close(null, statement, connection);

    }

    public static void get_Blob() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = connection.prepareStatement("select photo from beauty where id = 7");

        ResultSet set = statement.executeQuery();
        if (set.next()) {

            InputStream photo = set.getBinaryStream("photo");

            FileOutputStream fileOutputStream = new FileOutputStream("src//copy.jpg");

            int len;
            byte[] b = new byte[1024];
            while ((len = photo.read(b)) != -1) {
                fileOutputStream.write(b, 0, len);
            }
            fileOutputStream.close();
            photo.close();

        }

        JDBCUtils.Close(null, statement, connection);
    }

    public static void main(String[] args) throws Exception {
//        save_Blob();
        get_Blob();
    }

}
