package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Comment {
    private Integer commentid;

    private String commentcontent;

    private Date commenttime;

    private String commentpeoplename;

    private String commentstate;

    private Integer passageid;

    private String commentifdeleted;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getCommentpeoplename() {
        return commentpeoplename;
    }

    public void setCommentpeoplename(String commentpeoplename) {
        this.commentpeoplename = commentpeoplename == null ? null : commentpeoplename.trim();
    }

    public String getCommentstate() {
        return commentstate;
    }

    public void setCommentstate(String commentstate) {
        this.commentstate = commentstate == null ? null : commentstate.trim();
    }

    public Integer getPassageid() {
        return passageid;
    }

    public void setPassageid(Integer passageid) {
        this.passageid = passageid;
    }

    public String getCommentifdeleted() {
        return commentifdeleted;
    }

    public void setCommentifdeleted(String commentifdeleted) {
        this.commentifdeleted = commentifdeleted == null ? null : commentifdeleted.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "\"commentid\":\"" + commentid + '\"' +
                ", \"commentcontent\":\"" + commentcontent + '\"' +
                ", \"commenttime\":\"" + commenttime + '\"' +
                ", \"commentpeoplename\":\"" + commentpeoplename + '\"' +
                ", \"commentstate\":\"" + commentstate + '\"' +
                ", \"passageid\":\"" + passageid + '\"' +
                ", \"commentifdeleted\":\"" + commentifdeleted + '\"' +
                '}';
    }

    public Comment() {
    }

    public Comment(Integer commentid, String commentcontent, Date commenttime, String commentpeoplename, String commentstate, Integer passageid, String commentifdeleted) {
        this.commentid = commentid;
        this.commentcontent = commentcontent;
        this.commenttime = commenttime;
        this.commentpeoplename = commentpeoplename;
        this.commentstate = commentstate;
        this.passageid = passageid;
        this.commentifdeleted = commentifdeleted;
    }
}