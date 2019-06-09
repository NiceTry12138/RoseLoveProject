package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Email {
    private Integer emailid;

    private String emailsender;

    private String emailrecipient;

    private String emailtheme;

    private Date emailsendtime;

    private String emailcontent;

    private String emailifdeleted;

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
    }

    public String getEmailsender() {
        return emailsender;
    }

    public void setEmailsender(String emailsender) {
        this.emailsender = emailsender == null ? null : emailsender.trim();
    }

    public String getEmailrecipient() {
        return emailrecipient;
    }

    public void setEmailrecipient(String emailrecipient) {
        this.emailrecipient = emailrecipient == null ? null : emailrecipient.trim();
    }

    public String getEmailtheme() {
        return emailtheme;
    }

    public void setEmailtheme(String emailtheme) {
        this.emailtheme = emailtheme == null ? null : emailtheme.trim();
    }

    public Date getEmailsendtime() {
        return emailsendtime;
    }

    public void setEmailsendtime(Date emailsendtime) {
        this.emailsendtime = emailsendtime;
    }

    public String getEmailcontent() {
        return emailcontent;
    }

    public void setEmailcontent(String emailcontent) {
        this.emailcontent = emailcontent == null ? null : emailcontent.trim();
    }

    public String getEmailifdeleted() {
        return emailifdeleted;
    }

    public void setEmailifdeleted(String emailifdeleted) {
        this.emailifdeleted = emailifdeleted == null ? null : emailifdeleted.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "\"emailid\":\"" + emailid + '\"' +
                ", \"emailsender\":\"" + emailsender + '\"' +
                ", \"emailrecipient\":\"" + emailrecipient + '\"' +
                ", \"emailtheme\":\"" + emailtheme + '\"' +
                ", \"emailsendtime\":\"" + emailsendtime + "\"" +
                ", \"emailcontent\":\"" + emailcontent + '\"' +
                ", \"emailifdeleted\":\"" + emailifdeleted + '\"' +
                '}';
    }

    public Email() {
    }

    public Email(Integer emailid, String emailsender, String emailrecipient, String emailtheme, Date emailsendtime, String emailcontent, String emailifdeleted) {
        this.emailid = emailid;
        this.emailsender = emailsender;
        this.emailrecipient = emailrecipient;
        this.emailtheme = emailtheme;
        this.emailsendtime = emailsendtime;
        this.emailcontent = emailcontent;
        this.emailifdeleted = emailifdeleted;
    }
}