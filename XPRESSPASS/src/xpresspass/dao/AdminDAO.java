package xpresspass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import xpresspass.dbutil.DBConnection;
import xpresspass.pojo.AdminPojo;
import xpresspass.pojo.HodPojo;

public class AdminDAO {

    public static boolean registerAdmin(AdminPojo adminPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into admin_table values(?,?,?,?,?,?)");
        ps.setString(1, adminPojo.getEmp_id());
        ps.setString(2, adminPojo.getAuthority_id());
        ps.setString(3, adminPojo.getName());
        ps.setString(4, adminPojo.getCollege());
        ps.setString(5, adminPojo.getEmail());
        ps.setString(6, adminPojo.getPwd());
        int count = ps.executeUpdate();

        return (count == 1);
    }

    public static AdminPojo logInAdmin(AdminPojo adminPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select name from admin_table where emp_id=? and pwd=?");
        ps.setString(1, adminPojo.getEmp_id());
        ps.setString(2, adminPojo.getPwd());
        ResultSet rs=ps.executeQuery();
        AdminPojo admPojo=null;
        if(rs.next()==false)
            return admPojo;
        admPojo=new AdminPojo();
        admPojo.setName(rs.getString(1));
        return admPojo;
     }
public static boolean updatePassword(AdminPojo aPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update admin_table set pwd=? where emp_id=?");
        ps.setString(1,aPojo.getPwd());
        ps.setString(2,aPojo.getEmp_id());
        int count = ps.executeUpdate();
        if(count==1){
            return true;
        }
        return false;
    
    }
}
