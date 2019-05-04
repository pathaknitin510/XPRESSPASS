
package xpresspass.pojo;


public class StudentPojo {
    private String passId;
    private String studName;
    private String enroll;
    private String sem;
    private String studBranch;
    private String studCollege;
    private String studEmail;
    private String reason;
    private String studMob;
    private String studDated;
    private String studTime;
    private String studUsed;

    public StudentPojo() {
    }

    public StudentPojo(String passId, String studName, String enroll, String sem, String studBranch, String studCollege, String studEmail, String reason, String studMob, String studDated, String studTime, String studUsed) {
        this.passId = passId;
        this.studName = studName;
        this.enroll = enroll;
        this.sem = sem;
        this.studBranch = studBranch;
        this.studCollege = studCollege;
        this.studEmail = studEmail;
        this.reason = reason;
        this.studMob = studMob;
        this.studDated = studDated;
        this.studTime = studTime;
        this.studUsed = studUsed;
    }

    @Override
    public String toString() {
        return "StudentPojo{" + "passId=" + passId + ", studName=" + studName + ", enroll=" + enroll + ", sem=" + sem + ", studBranch=" + studBranch + ", studCollege=" + studCollege + ", studEmail=" + studEmail + ", reason=" + reason + ", studMob=" + studMob + ", studDated=" + studDated + ", studTime=" + studTime + ", studUsed=" + studUsed + '}';
    }
    
    

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getStudBranch() {
        return studBranch;
    }

    public void setStudBranch(String studBranch) {
        this.studBranch = studBranch;
    }

    public String getStudCollege() {
        return studCollege;
    }

    public void setStudCollege(String studCollege) {
        this.studCollege = studCollege;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStudMob() {
        return studMob;
    }

    public void setStudMob(String studMob) {
        this.studMob = studMob;
    }

    public String getStudDated() {
        return studDated;
    }

    public void setStudDated(String studDated) {
        this.studDated = studDated;
    }

    public String getStudTime() {
        return studTime;
    }

    public void setStudTime(String studTime) {
        this.studTime = studTime;
    }

    public String getStudUsed() {
        return studUsed;
    }

    public void setStudUsed(String studUsed) {
        this.studUsed = studUsed;
    }
    
    
    
    
    
}
