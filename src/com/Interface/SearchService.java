package com.Interface;

import com.Pojo.Usrs;

import java.util.ArrayList;
import java.util.HashMap;

public interface SearchService {
    public ArrayList<Usrs> findUsrs(HashMap<String , String > map); // map中存储查找用户的不同要求
    public Usrs findUsrsByMail(String mail); // 根据邮箱准确查找
    public Usrs findusrsByName(String name); // 根据用户名模糊查找
}
