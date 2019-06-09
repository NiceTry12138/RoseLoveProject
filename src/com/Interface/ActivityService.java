package com.Interface;

import com.Pojo.Activity;

import java.util.ArrayList;

public interface ActivityService {
    public ArrayList<Activity> allActivity(); // 查看全部活动
    public ArrayList<Activity> findActivity(String mail); // 通过邮箱查找活动
    public boolean updateActivity(Activity activity); // 更新活动
    public boolean deleteActivity(Integer id); // 通过活动ID删除活动
    public boolean addActivity(Activity activity); // 删除活动
}
