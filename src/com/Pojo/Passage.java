package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class Passage {
    private Integer passageid;

    private String passageusername;

    private Date passagesendtime;

    private String passagestate;

    private String usremail;

    private String passagecontent;

    private String passagename;

    private String passageifdeleted;

    private byte[] passagepic;

    public Integer getPassageid() {
        return passageid;
    }

    public void setPassageid(Integer passageid) {
        this.passageid = passageid;
    }

    public String getPassageusername() {
        return passageusername;
    }

    public void setPassageusername(String passageusername) {
        this.passageusername = passageusername == null ? null : passageusername.trim();
    }

    public Date getPassagesendtime() {
        return passagesendtime;
    }

    public void setPassagesendtime(Date passagesendtime) {
        this.passagesendtime = passagesendtime;
    }

    public String getPassagestate() {
        return passagestate;
    }

    public void setPassagestate(String passagestate) {
        this.passagestate = passagestate == null ? null : passagestate.trim();
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    public String getPassagecontent() {
        return passagecontent;
    }

    public void setPassagecontent(String passagecontent) {
        this.passagecontent = passagecontent == null ? null : passagecontent.trim();
    }

    public String getPassagename() {
        return passagename;
    }

    public void setPassagename(String passagename) {
        this.passagename = passagename == null ? null : passagename.trim();
    }

    public String getPassageifdeleted() {
        return passageifdeleted;
    }

    public void setPassageifdeleted(String passageifdeleted) {
        this.passageifdeleted = passageifdeleted == null ? null : passageifdeleted.trim();
    }

    public byte[] getPassagepic() {
        return passagepic;
    }

    public void setPassagepic(byte[] passagepic) {
        this.passagepic = passagepic;
    }

    @Override
    public String toString() {
        return "{" +
                "\"passageid\":\"" + passageid + '\"'+
                ", \"passageusername\":\"" + passageusername + '\"' +
                ", \"passagesendtime\":\"" + passagesendtime + '\"' +
                ", \"passagestate\":\"" + passagestate + '\"' +
                ", \"usremail\":\"" + usremail + '\"' +
                ", \"passagecontent\":\"" + passagecontent + '\"' +
                ", \"passagename\":\"" + passagename + '\"' +
                ", \"passageifdeleted\":\"" + passageifdeleted + '\"' +
                ", \"passagepic\":\"" + Arrays.toString(passagepic) + '\"' +
                '}';
    }

    public Passage() {
    }

    public Passage(Integer passageid, String passageusername, Date passagesendtime, String passagestate, String usremail, String passagecontent, String passagename, String passageifdeleted, byte[] passagepic) {
        this.passageid = passageid;
        this.passageusername = passageusername;
        this.passagesendtime = passagesendtime;
        this.passagestate = passagestate;
        this.usremail = usremail;
        this.passagecontent = passagecontent;
        this.passagename = passagename;
        this.passageifdeleted = passageifdeleted;
        this.passagepic = passagepic;
    }
}