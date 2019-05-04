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
public class HodPojo {
    private String hodEmpId;
    private String hodAuthorityId;
    private String hodName;
    private String hodBranch;
    private String hodCollege;
    private String hodEmail;
    private String hodPwd;

    public HodPojo() {
    }

    public HodPojo(String hodEmpId, String hodAuthorityId, String hodName, String hodBranch, String hodCollege, String hodEmail, String hodPwd) {
        this.hodEmpId = hodEmpId;
        this.hodAuthorityId = hodAuthorityId;
        this.hodName = hodName;
        this.hodBranch = hodBranch;
        this.hodCollege = hodCollege;
        this.hodEmail = hodEmail;
        this.hodPwd = hodPwd;
    }

    @Override
    public String toString() {
        return "HodPojo{" + "hodEmpId=" + hodEmpId + ", hodAuthorityId=" + hodAuthorityId + ", hodName=" + hodName + ", hodBranch=" + hodBranch + ", hodCollege=" + hodCollege + ", hodEmail=" + hodEmail + ", hodPwd=" + hodPwd + '}';
    }
     
    
    public String getHodEmpId() {
        return hodEmpId;
    }

    public void setHodEmpId(String hodEmpId) {
        this.hodEmpId = hodEmpId;
    }

    public String getHodAuthorityId() {
        return hodAuthorityId;
    }

    public void setHodAuthorityId(String HodAuthorityId) {
        this.hodAuthorityId = HodAuthorityId;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public String getHodBranch() {
        return hodBranch;
    }

    public void setHodBranch(String hodBranch) {
        this.hodBranch = hodBranch;
    }

    public String getHodCollege() {
        return hodCollege;
    }

    public void setHodCollege(String hodCollege) {
        this.hodCollege = hodCollege;
    }

    public String getHodEmail() {
        return hodEmail;
    }

    public void setHodEmail(String hodEmail) {
        this.hodEmail = hodEmail;
    }

    public String getHodPwd() {
        return hodPwd;
    }

    public void setHodPwd(String hodPwd) {
        this.hodPwd = hodPwd;
    }

    
    
}
