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
import xpresspass.pojo.StudentPojo;



public class StudentDAO {
    
    public static boolean generatePass(StudentPojo studPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into student_pass values(?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,studPojo.getPassId());
        ps.setString(2,studPojo.getStudName());
        ps.setString(3,studPojo.getEnroll());
        ps.setString(4,studPojo.getSem());
        ps.setString(5,studPojo.getStudBranch());
        ps.setString(6,studPojo.getStudCollege());
        ps.setString(7,studPojo.getStudEmail());
        ps.setString(8,studPojo.getReason());
        ps.setString(9,studPojo.getStudMob());
        ps.setString(10,studPojo.getStudDated());
        ps.setString(11,studPojo.getStudTime());
        ps.setString(12,studPojo.getStudUsed());
        
        int count=ps.executeUpdate();
        
        return (count==1);
    }
    public static ArrayList<StudentPojo> getAllStudents(HodPojo hPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,sem,dated,time,mob_no,used_time from student_pass where branch=? and college=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        
        ps.setString(1,hPojo.getHodBranch());
        ps.setString(2, hPojo.getHodCollege());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setSem(rs.getString(3));
            studPojo.setStudDated(rs.getString(4));
            studPojo.setStudTime(rs.getString(5));
            studPojo.setStudMob(rs.getString(6));
            studPojo.setStudUsed(rs.getString(7));
            
            studList.add(studPojo);
            
        }
        return studList;
    }
    public static ArrayList<StudentPojo> getAll() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,branch,college,dated,time,sem,mob_no,reason,used_time from student_pass");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudBranch(rs.getString(3));
            studPojo.setStudCollege(rs.getString(4));
            studPojo.setStudDated(rs.getString(5));
            studPojo.setStudTime(rs.getString(6));
            studPojo.setSem(rs.getString(7));
            studPojo.setStudMob(rs.getString(8));
            studPojo.setReason(rs.getString(9));
            studPojo.setStudUsed(rs.getString(10));
            
            studList.add(studPojo);
            
        }
        return studList;
    
    }
    public static ArrayList<String> getBranchByCollege(String college) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select distinct branch from student_pass where college=?");
        ArrayList<String> branchList=new ArrayList<>();
        ps.setString(1, college);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            branchList.add(rs.getString(1));
        }
        
       return branchList; 
    }
    public static ArrayList<String> getSemByCollege(String college) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select distinct sem from student_pass where college=?");
        ArrayList<String> semList=new ArrayList<>();
        ps.setString(1, college);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            semList.add(rs.getString(1));
        }
        
       return semList; 
    }
    public static ArrayList<StudentPojo> getByCBS(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where college=? and branch=? and sem=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        ps.setString(1,sPojo.getStudCollege());
        ps.setString(2,sPojo.getStudBranch());
        ps.setString(3,sPojo.getSem());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
    public static ArrayList<StudentPojo> getByCB(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where college=? and branch=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        ps.setString(1,sPojo.getStudCollege());
        ps.setString(2,sPojo.getStudBranch());
       
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
 public static ArrayList<StudentPojo> getByBS(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where  branch=? and sem=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        
        ps.setString(1,sPojo.getStudBranch());
        ps.setString(2,sPojo.getSem());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }

 public static ArrayList<StudentPojo> getByCS(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where college=?  and sem=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        ps.setString(1,sPojo.getStudCollege());
       
        ps.setString(2,sPojo.getSem());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
     public static ArrayList<StudentPojo> getByC(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where college=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
        ps.setString(1,sPojo.getStudCollege());
  
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
      public static ArrayList<StudentPojo> getByB(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where  branch=? ");
        ArrayList<StudentPojo> studList=new ArrayList<>();
      
        ps.setString(1,sPojo.getStudBranch());
      
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
       public static ArrayList<StudentPojo> getByS(StudentPojo sPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,dated,time,mob_no,reason from student_pass where  sem=?");
        ArrayList<StudentPojo> studList=new ArrayList<>();
       
        ps.setString(1,sPojo.getSem());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            StudentPojo studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setStudDated(rs.getString(3));
            studPojo.setStudTime(rs.getString(4));
           
            studPojo.setStudMob(rs.getString(5));
            studPojo.setReason(rs.getString(6));
            
            
            studList.add(studPojo);
            
        }
        return studList;
        
    }
    public static StudentPojo verifyPass(String passId) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,enroll_no,sem,branch,dated,time,college,reason,used_time from student_pass  where  pass_id=?");
        StudentPojo studPojo=null;
       
        ps.setString(1,passId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            studPojo=new StudentPojo();
            studPojo.setStudName(rs.getString(1));
            studPojo.setEnroll(rs.getString(2));
            studPojo.setSem(rs.getString(3));
            studPojo.setStudBranch(rs.getString(4));
            studPojo.setStudDated(rs.getString(5));
            studPojo.setStudTime(rs.getString(6));
            studPojo.setStudCollege(rs.getString(7));
            studPojo.setReason(rs.getString(8));
             studPojo.setStudUsed(rs.getString(9));
       }
        return studPojo;
}

    public static boolean updateUsedTime(String usedTime, String passId) throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update student_pass set used_time=? where pass_id=?");
        ps.setString(1, usedTime);
        ps.setString(2, passId);
        int count=ps.executeUpdate();
        return (count==1);
    }
    public static int getTotalPassCount() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select count(*) from student_pass");
        ResultSet rs=ps.executeQuery();
        rs.next();
        int count=rs.getInt(1);
        System.out.println(count);
        return count;
    }
    
}

