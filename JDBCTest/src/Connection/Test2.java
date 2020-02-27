package Connection;

import java.util.Properties;
/**
 * @author x1aolata
 * @date 2020/2/25 18:10
 * @script 反射方式加载类，运行期间加载
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 反射方式加载类，运行期间加载
        Class.forName("com.mysql.cj.jdbc.Driver");
      
    }
}
