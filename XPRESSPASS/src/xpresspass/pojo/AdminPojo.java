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
public class AdminPojo {

    private String emp_id;
    private String authority_id;
    private String name;
    private String college;
    private String email;
    private String pwd;

    public AdminPojo() {
    }

    public AdminPojo(String emp_id, String authority_id, String name, String college, String email, String pwd) {
        this.emp_id = emp_id;
        this.authority_id = authority_id;
        this.name = name;
        this.college = college;
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(String authority_id) {
        this.authority_id = authority_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
}
