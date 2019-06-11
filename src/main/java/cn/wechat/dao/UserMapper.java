package cn.wechat.dao;

import cn.wechat.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User checkOpenid(String openid);
    List<User> selectAll();
    User selectByOpenid(User user);
    int insertcopy(User user);

}