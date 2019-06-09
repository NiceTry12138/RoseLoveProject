package com.Interface;

import com.Pojo.Usrs;

public interface UsrService {
    public Usrs loginUsrs(String mail, String passwd, String vcode); // 登录邮箱 密码 验证码
    public Usrs searchUsrsByMail(String mail); // 通过邮箱查找用户
    public boolean deleteUsrsByMail(String mail); // 通过邮箱删除用户
    public boolean insertUsrsByUsrs(Usrs usrs); // 通过Usrs插入表
    public boolean updateUsrs(Usrs usrs); // 更新用户
}
