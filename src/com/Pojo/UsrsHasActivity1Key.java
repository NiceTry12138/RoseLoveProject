package com.Pojo;

import org.springframework.stereotype.Component;

@Component
public class UsrsHasActivity1Key {
    private String usremail;

    private Integer activityid;

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }
}