package com.Pojo;

import org.springframework.stereotype.Component;

@Component
public class Hobby {
    private Integer hobbyid;

    private String hobbytype;

    private String hobbycontent;

    private String usremail;

    public Integer getHobbyid() {
        return hobbyid;
    }

    public void setHobbyid(Integer hobbyid) {
        this.hobbyid = hobbyid;
    }

    public String getHobbytype() {
        return hobbytype;
    }

    public void setHobbytype(String hobbytype) {
        this.hobbytype = hobbytype == null ? null : hobbytype.trim();
    }

    public String getHobbycontent() {
        return hobbycontent;
    }

    public void setHobbycontent(String hobbycontent) {
        this.hobbycontent = hobbycontent == null ? null : hobbycontent.trim();
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
                "\"hobbyid\":\"" + hobbyid + '\"' +
                ", \"hobbytype\":\"" + hobbytype + '\"' +
                ", \"hobbycontent\":\"" + hobbycontent + '\"' +
                ", \"usremail\":\"" + usremail + '\"' +
                '}';
    }

    public Hobby() {
    }

    public Hobby(Integer hobbyid, String hobbytype, String hobbycontent, String usremail) {
        this.hobbyid = hobbyid;
        this.hobbytype = hobbytype;
        this.hobbycontent = hobbycontent;
        this.usremail = usremail;
    }
}