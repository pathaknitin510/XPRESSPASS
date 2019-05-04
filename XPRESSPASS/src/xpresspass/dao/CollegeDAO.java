
package xpresspass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import xpresspass.dbutil.DBConnection;
import xpresspass.pojo.StudentPojo;


public class CollegeDAO {
    
     public static StudentPojo findLnctStudent(String enroll) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,sem,email,contact,reason from student_lnct where enroll_no=?");
        ps.setString(1, enroll);
        ResultSet rs=ps.executeQuery();
        
        StudentPojo sPojo=null;
        while(rs.next())
        {
            sPojo=new StudentPojo();
            sPojo.setStudName(rs.getString(1));
            sPojo.setSem(rs.getString(2));
            sPojo.setStudEmail(rs.getString(3));
            sPojo.setStudMob(rs.getString(4));
            sPojo.setReason(rs.getString(5));
        }
        
        return sPojo;
}
     
   public static StudentPojo findLnctsStudent(String enroll) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,sem,email,contact,reason from student_lncts where enroll_no=?");
        ps.setString(1, enroll);
        ResultSet rs=ps.executeQuery();
        
        StudentPojo sPojo=null;
        while(rs.next())
        {
            sPojo=new StudentPojo();
            sPojo.setStudName(rs.getString(1));
            sPojo.setSem(rs.getString(2));
            sPojo.setStudEmail(rs.getString(3));
            sPojo.setStudMob(rs.getString(4));
            sPojo.setReason(rs.getString(5));
        }
        
        return sPojo;   
  }  
    public static StudentPojo findLncteStudent(String enroll) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,sem,email,contact,reason from student_lncte where enroll_no=?");
        ps.setString(1, enroll);
        ResultSet rs=ps.executeQuery();
        
        StudentPojo sPojo=null;
        while(rs.next())
        {
            sPojo=new StudentPojo();
            sPojo.setStudName(rs.getString(1));
            sPojo.setSem(rs.getString(2));
            sPojo.setStudEmail(rs.getString(3));
            sPojo.setStudMob(rs.getString(4));
            sPojo.setReason(rs.getString(5));
        }
        
        return sPojo;
  }
    public static boolean insertLnctStudent(StudentPojo sPojo) throws SQLException
 
{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into student_lnct values(?,?,?,?,?,?,?)"); 
        ps.setString(1,sPojo.getStudName());
        ps.setString(2,sPojo.getEnroll());
        ps.setString(3,sPojo.getSem());
        ps.setString(4,sPojo.getStudEmail());
        ps.setString(5,sPojo.getStudMob());
        ps.setString(6,sPojo.getReason());
        ps.setString(7,sPojo.getPassId());
        int count=ps.executeUpdate();
        return(count==1);
    
}
 public static boolean insertLnctsStudent(StudentPojo sPojo) throws SQLException
 
{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into student_lncts values(?,?,?,?,?,?,?)"); 
        ps.setString(1,sPojo.getStudName());
        ps.setString(2,sPojo.getEnroll());
        ps.setString(3,sPojo.getSem());
        ps.setString(4,sPojo.getStudEmail());
        ps.setString(5,sPojo.getStudMob());
        ps.setString(6,sPojo.getReason());
        ps.setString(7,sPojo.getPassId());
        int count=ps.executeUpdate();
        return(count==1);
    
} 
 public static boolean insertLncteStudent(StudentPojo sPojo) throws SQLException
 
{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into student_lncte values(?,?,?,?,?,?,?)"); 
        ps.setString(1,sPojo.getStudName());
        ps.setString(2,sPojo.getEnroll());
        ps.setString(3,sPojo.getSem());
        ps.setString(4,sPojo.getStudEmail());
        ps.setString(5,sPojo.getStudMob());
        ps.setString(6,sPojo.getReason());
        ps.setString(7,sPojo.getPassId());
        int count=ps.executeUpdate();
        return(count==1);
    
}
 public static StudentPojo searchLnctPass(String passId) throws SQLException
 {
      Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,sem,email,contact,reason from student_lnct  where  pass_id=?");
        StudentPojo studPojo=null;
       
        ps.setString(1,passId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setSem(rs.getString(3));
            studPojo.setStudEmail(rs.getString(4));
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
       }
        return studPojo;
     
     
 }
 public static StudentPojo searchLnctsPass(String passId) throws SQLException
 {
      Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,sem,email,contact,reason from student_lncts  where  pass_id=?");
        StudentPojo studPojo=null;
       
        ps.setString(1,passId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setSem(rs.getString(3));
            studPojo.setStudEmail(rs.getString(4));
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
       }
        System.out.println(studPojo);
        return studPojo;
     
     
 }
 public static StudentPojo searchLnctePass(String passId) throws SQLException
 {
      Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,sem,email,contact,reason from student_lncte  where  pass_id=?");
        StudentPojo studPojo=null;
       
        ps.setString(1,passId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setSem(rs.getString(3));
            studPojo.setStudEmail(rs.getString(4));
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
       }
        return studPojo;
     
     
 }
    
    
    
    
}