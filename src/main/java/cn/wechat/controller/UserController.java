package cn.wechat.controller;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.User;
import cn.wechat.service.UserService;

import cn.wechat.util.WXSessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 检查是否授权
     * @param code
     * @param appid
     * @param secret
     * @return
     */
    @RequestMapping(value = "/loginUser", produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public BaseData wxcheck(@RequestParam(value="code") String code,
                            @RequestParam(value = "appid") String appid,
                            @RequestParam(value = "secret") String secret){
        WeChatController weChatController=new WeChatController();
        WXSessionModel model=weChatController.wxLogin(code,appid,secret);
        BaseData baseData=userService.checkOpenid(model.getOpenid());
        System.out.println("baseData="+baseData.getJudge());
        return baseData;
    }

    /*
     * 用户注册
     * @return
     **/
    @RequestMapping("/addUser")
    @ResponseBody
//    public BaseData addUser(User user){
    public BaseData addUser(@RequestParam("userId") String userId,@RequestParam("url") String url,
                              @RequestParam("openid") String openid){

        User user=new User();
        user.setUserId(userId);
        user.setOpenid(openid);
        user.setUrl(url);
        //把用户加入到用户表中
        BaseData baseData= userService.addUser(user);
        System.out.println("添加成功");
        return baseData;
    }

    /*
    * openid 获取用户信息
    *
    * */
    @RequestMapping("/getUserByOpenid")
    @ResponseBody
    public User getUserByOpenid(User user){

        return userService.selectByOpenid(user);
    }


    /*
     *查询用户(全部)
     *
     **/
    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        return userService.getUser();
    }

}
