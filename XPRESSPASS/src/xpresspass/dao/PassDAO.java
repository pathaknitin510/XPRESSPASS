

package xpresspass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import xpresspass.dbutil.DBConnection;
import xpresspass.pojo.HodPojo;
import xpresspass.pojo.PassPojo;


public class PassDAO {
    
    public static PassPojo getPass(HodPojo hodPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select rem_pass,used_pass,dated,time,message from pass_table where authority_id=?");
        ps.setString(1,hodPojo.getHodAuthorityId());
        ResultSet rs=ps.executeQuery();
        PassPojo passPojo=null;
        if(rs.next()==false)
            return passPojo;
        passPojo=new PassPojo();
        passPojo.setRem_pass(rs.getInt(1));
        passPojo.setUsed_pass(rs.getInt(2));
        passPojo.setDate_pass(rs.getString(3));
        passPojo.setTime_pass(rs.getString(4));
        passPojo.setMessage(rs.getString(5));
        return passPojo;
    }
    public static boolean insertPass(PassPojo passPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into pass_table values(?,?,?,?,?,?,?)");
        ps.setString(1,passPojo.getBranch_pass());
        ps.setString(2,passPojo.getCollege_pass());
        ps.setInt(3,passPojo.getRem_pass());
        ps.setInt(4,passPojo.getUsed_pass());
        ps.setString(5,passPojo.getDate_pass());
        ps.setString(6, passPojo.getTime_pass());
        ps.setString(7,passPojo.getAuthority_id());
        int count=ps.executeUpdate();
        return (count==1);
    }
    public static boolean updatePass(PassPojo passPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update pass_table set rem_pass=?,used_pass=?,dated=?,time=?,message=? where authority_id=?");
        ps.setInt(1, passPojo.getRem_pass());
        ps.setInt(2, passPojo.getUsed_pass());
        ps.setString(3,passPojo.getDate_pass());
        ps.setString(4,passPojo.getTime_pass());
        ps.setString(6,passPojo.getAuthority_id());
        ps.setString(5,passPojo.getMessage());
        int count=ps.executeUpdate();
        return (count==1);
    }
    public static boolean changePassByCB(PassPojo passPojo,int count,String msg) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update pass_table set rem_pass=?,message=? where college=? and branch=?");
        ps.setInt(1, count);
        ps.setString(3,passPojo.getCollege_pass());
        ps.setString(4,passPojo.getBranch_pass());
        ps.setString(2, msg);
        int c=ps.executeUpdate();
        return (c==1);
        
    }
    public static boolean changePassByC(PassPojo passPojo,int count,String msg) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update pass_table set rem_pass=?,message=? where college=?");
        ps.setInt(1, count);
        ps.setString(2, msg);
        ps.setString(3,passPojo.getCollege_pass());
        int c=ps.executeUpdate();
        return (c==1);
        
    }
    public static boolean changePassByB(PassPojo passPojo,int count,String msg) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update pass_table set rem_pass=?,message=? where branch=?");
        ps.setInt(1, count);
        ps.setString(2, msg);
        ps.setString(3,passPojo.getBranch_pass());
        int c=ps.executeUpdate();
        return (c==1);
        
    }
    public static boolean changePassCount(int count,String msg) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update pass_table set rem_pass=?,message=?");
        ps.setInt(1, count);
        ps.setString(2, msg);
        int c=ps.executeUpdate();
        if(c==0)
          return false;
        //System.out.println(c);
        return true;
        
    }
    
}
