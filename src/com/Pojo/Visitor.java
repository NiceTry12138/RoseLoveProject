package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Visitor {
    private Integer visitimformationid;

    private String visitoremail;

    private String visitorname;

    private Date visitortime;

    private String usremail;

    public Integer getVisitimformationid() {
        return visitimformationid;
    }

    public void setVisitimformationid(Integer visitimformationid) {
        this.visitimformationid = visitimformationid;
    }

    public String getVisitoremail() {
        return visitoremail;
    }

    public void setVisitoremail(String visitoremail) {
        this.visitoremail = visitoremail == null ? null : visitoremail.trim();
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname == null ? null : visitorname.trim();
    }

    public Date getVisitortime() {
        return visitortime;
    }

    public void setVisitortime(Date visitortime) {
        this.visitortime = visitortime;
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "\"visitimformationid\":\"" + visitimformationid + '\"' +
                ", \"visitoremail\":\"" + visitoremail + '\"' +
                ", \"visitorname\":\"" + visitorname + '\"' +
                ", \"visitortime\":\"" + visitortime + '\"' +
                ", \"usremail\":\"" + usremail + '\"' +
                '}';
    }

    public Visitor() {
    }

    public Visitor(Integer visitimformationid, String visitoremail, String visitorname, Date visitortime, String usremail) {
        this.visitimformationid = visitimformationid;
        this.visitoremail = visitoremail;
        this.visitorname = visitorname;
        this.visitortime = visitortime;
        this.usremail = usremail;
    }
}