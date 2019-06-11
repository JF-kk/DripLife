package cn.wechat.service.serviceImpl;

import cn.wechat.base.BaseData;
import cn.wechat.dao.UserMapper;
import cn.wechat.pojo.User;
import cn.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseData addUser(User user) {
        BaseData baseData=new BaseData();
        int result=userMapper.insertcopy(user);
        System.out.println(result);
        if (result==1){
            baseData.setJudge("true");
        }
        else
            baseData.setJudge("false");
        return baseData;
    }

    @Override
    public User selectByOpenid(User user) {
        User result=userMapper.selectByOpenid(user);
        System.out.println(result);
        return result;
    }

    @Override
    public List<User> getUser() {
        List<User> list=userMapper.selectAll();
        return list;
    }

    @Override
    public BaseData checkOpenid(String openid) {
        BaseData baseData=new BaseData();
        User result=userMapper.checkOpenid(openid);
        if (result==null){
            baseData.setOpenid(openid);
            baseData.setCode("1001");
        }
        else {
            baseData.setOpenid(openid);
            baseData.setCode("0");
        }
        return baseData;
    }
}
