package cn.wechat.service;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.User;

import java.util.List;

public interface UserService {
    public BaseData addUser(User user);
    public User selectByOpenid(User user);
    public List<User> getUser();
    public BaseData checkOpenid(String openid);
}
