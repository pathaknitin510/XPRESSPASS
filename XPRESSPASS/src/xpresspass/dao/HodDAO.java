/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import xpresspass.dbutil.DBConnection;
import xpresspass.pojo.HodPojo;
import xpresspass.pojo.PassPojo;
import xpresspass.pojo.StudentPojo;

public class HodDAO {

    public static boolean isHodExist(HodPojo hodPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from hod_table where branch=? and college=?");
        ps.setString(1, hodPojo.getHodBranch());
        ps.setString(2, hodPojo.getHodCollege());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

//    public static String getAuthorityId() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean registerHod(HodPojo hodPojo) throws SQLException {

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into hod_table values(?,?,?,?,?,?,?)");
        ps.setString(1, hodPojo.getHodEmpId());
        ps.setString(2, hodPojo.getHodAuthorityId());
        ps.setString(3, hodPojo.getHodName());
        ps.setString(4, hodPojo.getHodBranch());
        ps.setString(5, hodPojo.getHodCollege());
        ps.setString(6, hodPojo.getHodEmail());
        ps.setString(7, hodPojo.getHodPwd());
        int count = ps.executeUpdate();
        return (count == 1);

    }

    public static HodPojo logInHod(HodPojo hodPojo) throws SQLException {

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select name,branch,college,authority_id from hod_table where emp_id=? and pwd=?");
        ps.setString(1, hodPojo.getHodEmpId());
        ps.setString(2, hodPojo.getHodPwd());
        ResultSet rs = ps.executeQuery();
        HodPojo newHodPojo = new HodPojo();
        while (rs.next()) {
            newHodPojo.setHodName(rs.getString(1));
            newHodPojo.setHodBranch(rs.getString(2));
            newHodPojo.setHodCollege(rs.getString(3));
            newHodPojo.setHodAuthorityId(rs.getString(4));
        }
        return newHodPojo;

    }

    public static boolean removeHodByCB(HodPojo hodPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from hod_table where branch=? and college=?");
        ps.setString(1, hodPojo.getHodBranch());
        ps.setString(2, hodPojo.getHodCollege());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static ArrayList<HodPojo> getAll() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select name,email,branch,college from hod_table");
        ArrayList<HodPojo> hodList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            HodPojo hodPojo = new HodPojo();
            hodPojo.setHodName(rs.getString(1));
            hodPojo.setHodEmail(rs.getString(2));
            hodPojo.setHodBranch(rs.getString(3));
            hodPojo.setHodCollege(rs.getString(4));

            hodList.add(hodPojo);

        }
        return hodList;

    }

    public static ArrayList<String> getBranchByCollege(String college) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select branch from hod_table where college=?");
        ArrayList<String> branchList = new ArrayList<>();
        ps.setString(1, college);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            branchList.add(rs.getString(1));
        }

        return branchList;
    }

    public static boolean removeHodByC(HodPojo hPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from hod_table where college=?");

        ps.setString(1, hPojo.getHodCollege());

        int c = ps.executeUpdate();
        return (c == 1);

    }

    public static boolean removeHodByB(HodPojo hPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from hod_table where branch=?");

        ps.setString(1, hPojo.getHodBranch());

        int c = ps.executeUpdate();
        return (c == 1);

    }

    public static boolean removeAllHod() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from hod_table");

        int c = ps.executeUpdate();
        if (c == 0) {
            return false;
        }
        return true;

    }

    public static boolean updatePassword(HodPojo hPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update hod_table set pwd=? where emp_id=?");
        ps.setString(1,hPojo.getHodPwd());
        ps.setString(2,hPojo.getHodEmpId());
        int count = ps.executeUpdate();
        if(count==1){
            return true;
        }
        return false;
    
    }

}
