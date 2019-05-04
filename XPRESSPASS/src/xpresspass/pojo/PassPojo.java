/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.pojo;

/**
 *
 * @author Rahul
 */
public class PassPojo {
    private String branch_pass;
    private String college_pass;
    private int rem_pass;
    private int used_pass;
    private String date_pass;
    private String time_pass;
    private String authority_id;
    private String message;
    public PassPojo() {
    }

    @Override
    public String toString() {
        return "PassPojo{" + "branch_pass=" + branch_pass + ", college_pass=" + college_pass + ", rem_pass=" + rem_pass + ", used_pass=" + used_pass + ", date_pass=" + date_pass + ", time_pass=" + time_pass + ", authority_id=" + authority_id + '}';
    }
     
    public PassPojo(String branch_pass, String college_pass, int rem_pass, int used_pass, String date_pass,String time_pass,String authority_id) {
        this.branch_pass = branch_pass;
        this.college_pass = college_pass;
        this.rem_pass = rem_pass;
        this.used_pass = used_pass;
        this.date_pass = date_pass;
        this.time_pass=time_pass;
        this.authority_id=authority_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
       
    
    public String getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(String authority_id) {
        this.authority_id = authority_id;
    }

    
    
    public String getTime_pass() {
        return time_pass;
    }

    public void setTime_pass(String time_pass) {
        this.time_pass = time_pass;
    }
    
    
    
    public String getBranch_pass() {
        return branch_pass;
    }

    public void setBranch_pass(String branch_pass) {
        this.branch_pass = branch_pass;
    }

    public String getCollege_pass() {
        return college_pass;
    }

    public void setCollege_pass(String college_pass) {
        this.college_pass = college_pass;
    }

    public int getRem_pass() {
        return rem_pass;
    }

    public void setRem_pass(int rem_pass) {
        this.rem_pass = rem_pass;
    }

    public int getUsed_pass() {
        return used_pass;
    }

    public void setUsed_pass(int used_pass) {
        this.used_pass = used_pass;
    }

    public String getDate_pass() {
        return date_pass;
    }

    public void setDate_pass(String date_pass) {
        this.date_pass = date_pass;
    }
    
}
