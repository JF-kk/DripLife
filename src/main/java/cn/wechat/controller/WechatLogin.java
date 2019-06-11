package cn.wechat.controller;

import cn.wechat.base.BaseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wechat")
public class WechatLogin {
    @RequestMapping("/login")
    @ResponseBody
    public BaseData test(@RequestParam("name") String name){
        /*System.out.println("ddd");*/
        BaseData baseData=new BaseData();
        baseData.setCode("1001");
        System.out.println(baseData.getCode());
        return baseData;
    }
}