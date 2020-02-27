import java.util.List;

/**
 * @author x1aolata
 * @date 2020/2/27 23:22
 * @script DAO类和AdminDAO类的测试
 */
public class DAO_Test {
    public static void main(String[] args) {
        AdminDAO adminDAO = new AdminDAO();
//        Object o = adminDAO.queryScalar("select count(*) from admin");
//        System.out.println(o);


//        int update = adminDAO.update("update admin set username='x1aolata' where id = 9");
//        System.out.println(update);

//        List<Admin> admins = adminDAO.queryMulti("select * from admin where id between ? and  ?", Admin.class, 3, 5);
//        for (Admin a : admins
//        ) {
//            System.out.println(a);
//        }


        Admin admin = adminDAO.querySingle("select * from admin where id =?", Admin.class, 9);
        System.out.println(admin);
    }
}
