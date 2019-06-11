package cn.wechat.service;


import cn.wechat.base.BaseData;
import cn.wechat.pojo.Admin;

import javax.servlet.http.HttpSession;

/*
 *   实现管理员登录功能
 */
public interface AdminService {
    Admin test(int id);
    /*BaseData login(Admin admin );*/
    BaseData login(Admin admin , HttpSession session );
    BaseData adminAdd(Admin admin);
    BaseData adminUpdata(Admin admin);
}
