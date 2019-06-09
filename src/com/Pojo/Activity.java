package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class Activity {
    private Integer activityid;

    private String activityname;

    private Date activitystarttime;

    private Date activityendtime;

    private String activityaddress;

    private String activitytype;

    private String activitydescribe;

    private Integer activitycost;

    private String activitycostexplain;

    private String activitycallnumber;

    private String activitystate;

    private String activityifdeleted;

    private Integer activityboylimit;

    private Integer activitygirllimit;

    private String activityorganizer;

    private String activityorganizeremail;

    private byte[] activitypic;

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    public Date getActivitystarttime() {
        return activitystarttime;
    }

    public void setActivitystarttime(Date activitystarttime) {
        this.activitystarttime = activitystarttime;
    }

    public Date getActivityendtime() {
        return activityendtime;
    }

    public void setActivityendtime(Date activityendtime) {
        this.activityendtime = activityendtime;
    }

    public String getActivityaddress() {
        return activityaddress;
    }

    public void setActivityaddress(String activityaddress) {
        this.activityaddress = activityaddress == null ? null : activityaddress.trim();
    }

    public String getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype == null ? null : activitytype.trim();
    }

    public String getActivitydescribe() {
        return activitydescribe;
    }

    public void setActivitydescribe(String activitydescribe) {
        this.activitydescribe = activitydescribe == null ? null : activitydescribe.trim();
    }

    public Integer getActivitycost() {
        return activitycost;
    }

    public void setActivitycost(Integer activitycost) {
        this.activitycost = activitycost;
    }

    public String getActivitycostexplain() {
        return activitycostexplain;
    }

    public void setActivitycostexplain(String activitycostexplain) {
        this.activitycostexplain = activitycostexplain == null ? null : activitycostexplain.trim();
    }

    public String getActivitycallnumber() {
        return activitycallnumber;
    }

    public void setActivitycallnumber(String activitycallnumber) {
        this.activitycallnumber = activitycallnumber == null ? null : activitycallnumber.trim();
    }

    public String getActivitystate() {
        return activitystate;
    }

    public void setActivitystate(String activitystate) {
        this.activitystate = activitystate == null ? null : activitystate.trim();
    }

    public String getActivityifdeleted() {
        return activityifdeleted;
    }

    public void setActivityifdeleted(String activityifdeleted) {
        this.activityifdeleted = activityifdeleted == null ? null : activityifdeleted.trim();
    }

    public Integer getActivityboylimit() {
        return activityboylimit;
    }

    public void setActivityboylimit(Integer activityboylimit) {
        this.activityboylimit = activityboylimit;
    }

    public Integer getActivitygirllimit() {
        return activitygirllimit;
    }

    public void setActivitygirllimit(Integer activitygirllimit) {
        this.activitygirllimit = activitygirllimit;
    }

    public String getActivityorganizer() {
        return activityorganizer;
    }

    public void setActivityorganizer(String activityorganizer) {
        this.activityorganizer = activityorganizer == null ? null : activityorganizer.trim();
    }

    public String getActivityorganizeremail() {
        return activityorganizeremail;
    }

    public void setActivityorganizeremail(String activityorganizeremail) {
        this.activityorganizeremail = activityorganizeremail == null ? null : activityorganizeremail.trim();
    }

    public byte[] getActivitypic() {
        return activitypic;
    }

    public void setActivitypic(byte[] activitypic) {
        this.activitypic = activitypic;
    }

    @Override
    public String toString() {
        return "{" +
                "\"activityid\":\"" + activityid + "\"" +
                ", \"activityname\":\"" + activityname + '\"' +
                ", \"activitystarttime\":\"" + activitystarttime +"\""+
                ", \"activityendtime\":\"" + activityendtime +"\""+
                ", \"activityaddress\":\"" + activityaddress + '\"' +
                ", \"activitytype\":\"" + activitytype + '\"' +
                ", \"activitydescribe\":\"" + activitydescribe + '\"' +
                ", \"activitycost\":\"" + activitycost +"\"" +
                ", \"activitycostexplain\":\"" + activitycostexplain + '\"' +
                ", \"activitycallnumber\":\"" + activitycallnumber + '\"' +
                ", \"activitystate\":\"" + activitystate + '\"' +
                ", \"activityifdeleted\":\"" + activityifdeleted + '\"' +
                ", \"activityboylimit\":\"" + activityboylimit + "\""+
                ", \"activitygirllimit\":\"" + activitygirllimit +"\""+
                ", \"activityorganizer\":\"" + activityorganizer + '\"' +
                ", \"activityorganizeremail\":\"" + activityorganizeremail + '\"' +
                ", \"activitypic\":\"" + Arrays.toString(activitypic) + "\"" +
                '}';
    }

    public Activity() {
    }

    public Activity(Integer activityid, String activityname, Date activitystarttime, Date activityendtime, String activityaddress, String activitytype, String activitydescribe, Integer activitycost, String activitycostexplain, String activitycallnumber, String activitystate, String activityifdeleted, Integer activityboylimit, Integer activitygirllimit, String activityorganizer, String activityorganizeremail, byte[] activitypic) {
        this.activityid = activityid;
        this.activityname = activityname;
        this.activitystarttime = activitystarttime;
        this.activityendtime = activityendtime;
        this.activityaddress = activityaddress;
        this.activitytype = activitytype;
        this.activitydescribe = activitydescribe;
        this.activitycost = activitycost;
        this.activitycostexplain = activitycostexplain;
        this.activitycallnumber = activitycallnumber;
        this.activitystate = activitystate;
        this.activityifdeleted = activityifdeleted;
        this.activityboylimit = activityboylimit;
        this.activitygirllimit = activitygirllimit;
        this.activityorganizer = activityorganizer;
        this.activityorganizeremail = activityorganizeremail;
        this.activitypic = activitypic;
    }
}