package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Usrs {
    private String usremail;

    private Integer usrid;

    private String usrname;

    private String usrsex;

    private Date usrbirth;

    private String usrconstellation;

    private String usrmaritalstate;

    private Float usrheight;

    private String usreducation;

    private Integer usrincome;

    private String usroccupation;

    private String usrphotostate;

    private Integer usrheadsculptureid;

    private String usrifprohibit;

    private String usrspassword;

    private String usrssignature;

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    public Integer getUsrid() {
        return usrid;
    }

    public void setUsrid(Integer usrid) {
        this.usrid = usrid;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname == null ? null : usrname.trim();
    }

    public String getUsrsex() {
        return usrsex;
    }

    public void setUsrsex(String usrsex) {
        this.usrsex = usrsex == null ? null : usrsex.trim();
    }

    public Date getUsrbirth() {
        return usrbirth;
    }

    public void setUsrbirth(Date usrbirth) {
        this.usrbirth = usrbirth;
    }

    public String getUsrconstellation() {
        return usrconstellation;
    }

    public void setUsrconstellation(String usrconstellation) {
        this.usrconstellation = usrconstellation == null ? null : usrconstellation.trim();
    }

    public String getUsrmaritalstate() {
        return usrmaritalstate;
    }

    public void setUsrmaritalstate(String usrmaritalstate) {
        this.usrmaritalstate = usrmaritalstate == null ? null : usrmaritalstate.trim();
    }

    public Float getUsrheight() {
        return usrheight;
    }

    public void setUsrheight(Float usrheight) {
        this.usrheight = usrheight;
    }

    public String getUsreducation() {
        return usreducation;
    }

    public void setUsreducation(String usreducation) {
        this.usreducation = usreducation == null ? null : usreducation.trim();
    }

    public Integer getUsrincome() {
        return usrincome;
    }

    public void setUsrincome(Integer usrincome) {
        this.usrincome = usrincome;
    }

    public String getUsroccupation() {
        return usroccupation;
    }

    public void setUsroccupation(String usroccupation) {
        this.usroccupation = usroccupation == null ? null : usroccupation.trim();
    }

    public String getUsrphotostate() {
        return usrphotostate;
    }

    public void setUsrphotostate(String usrphotostate) {
        this.usrphotostate = usrphotostate == null ? null : usrphotostate.trim();
    }

    public Integer getUsrheadsculptureid() {
        return usrheadsculptureid;
    }

    public void setUsrheadsculptureid(Integer usrheadsculptureid) {
        this.usrheadsculptureid = usrheadsculptureid;
    }

    public String getUsrifprohibit() {
        return usrifprohibit;
    }

    public void setUsrifprohibit(String usrifprohibit) {
        this.usrifprohibit = usrifprohibit == null ? null : usrifprohibit.trim();
    }

    public String getUsrspassword() {
        return usrspassword;
    }

    public void setUsrspassword(String usrspassword) {
        this.usrspassword = usrspassword == null ? null : usrspassword.trim();
    }

    public String getUsrssignature() {
        return usrssignature;
    }

    public void setUsrssignature(String usrssignature) {
        this.usrssignature = usrssignature == null ? null : usrssignature.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "\"usremail\":\"" + usremail + '\"' +
                ", \"usrid\":\"" + usrid + '\"' +
                ", \"usrname\":\"" + usrname + '\"' +
                ", \"usrsex\":\"" + usrsex + '\"' +
                ", \"usrbirth\":\"" + usrbirth + '\"' +
                ", \"usrconstellation\":\"" + usrconstellation + '\"' +
                ", \"usrmaritalstate\":\"" + usrmaritalstate + '\"' +
                ", \"usrheight\":\"" + usrheight + '\"' +
                ", \"usreducation\":\"" + usreducation + '\"' +
                ", \"usrincome\":\"" + usrincome + '\"' +
                ", \"usroccupation\":\"" + usroccupation + '\"' +
                ", \"usrphotostate\":\"" + usrphotostate + '\"' +
                ", \"usrheadsculptureid\":\"" + usrheadsculptureid + '\"' +
                ", \"usrifprohibit\":\"" + usrifprohibit + '\"' +
                ", \"usrspassword\":\"" + usrspassword + '\"' +
                ", \"usrssignature\":\"" + usrssignature + '\"' +
                '}';
    }

    public Usrs() {
    }

    public Usrs(String usremail, Integer usrid, String usrname, String usrsex, Date usrbirth, String usrconstellation, String usrmaritalstate, Float usrheight, String usreducation, Integer usrincome, String usroccupation, String usrphotostate, Integer usrheadsculptureid, String usrifprohibit, String usrspassword, String usrssignature) {
        this.usremail = usremail;
        this.usrid = usrid;
        this.usrname = usrname;
        this.usrsex = usrsex;
        this.usrbirth = usrbirth;
        this.usrconstellation = usrconstellation;
        this.usrmaritalstate = usrmaritalstate;
        this.usrheight = usrheight;
        this.usreducation = usreducation;
        this.usrincome = usrincome;
        this.usroccupation = usroccupation;
        this.usrphotostate = usrphotostate;
        this.usrheadsculptureid = usrheadsculptureid;
        this.usrifprohibit = usrifprohibit;
        this.usrspassword = usrspassword;
        this.usrssignature = usrssignature;
    }
}