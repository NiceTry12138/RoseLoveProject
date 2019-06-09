package com.Interface;

import com.Pojo.Passage;

import java.util.ArrayList;

public interface ArticleService {
    public boolean addArticle(Passage passage); // 添加文章
    public ArrayList<Passage> findArticle(String mail); // 通过邮箱查找用户对应的多篇文章
    public boolean deleteArticle(Integer id); // 通过邮件id准确删除对应文件
    public boolean updateArticle(Passage passage); // 更新文章
}
