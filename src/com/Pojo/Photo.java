package com.Pojo;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Photo {
    private Integer photoid;

    private String usremail;

    private byte[] photocontent;

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    public byte[] getPhotocontent() {
        return photocontent;
    }

    public void setPhotocontent(byte[] photocontent) {
        this.photocontent = photocontent;
    }

    @Override
    public String toString() {
        return "{" +
                "\"photoid\":\"" + photoid + '\"'+
                ", \"usremail\":\"" + usremail + '\"' +
                ", \"photocontent\":\"" + Arrays.toString(photocontent) + '\"' +
                '}';
    }

    public Photo() {
    }

    public Photo(Integer photoid, String usremail, byte[] photocontent) {
        this.photoid = photoid;
        this.usremail = usremail;
        this.photocontent = photocontent;
    }
}