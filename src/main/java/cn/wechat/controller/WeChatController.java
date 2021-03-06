package cn.wechat.controller;
import java.util.HashMap;
import java.util.Map;

import cn.wechat.util.HttpClientUtil;
import cn.wechat.util.JsonUtils;
import cn.wechat.util.WXSessionModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 用于处理用户登录获取openid
 * @author liten
 *
 */
@Controller
public class WeChatController {

    @RequestMapping(value = "/loginuser", produces = {"application/json;charset=UTF-8" })
    @ResponseBody
    public WXSessionModel wxLogin(@RequestParam(value="code") String code,
                                  @RequestParam(value = "appid") String appid,
                                  @RequestParam(value = "secret") String secret){

        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> param = new HashMap<>();
        param.put("appid", appid);
        param.put("secret", secret);
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        String wxResult = HttpClientUtil.doGet(url, param);
        WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);
        System.out.println("wxResult="+wxResult);
        System.out.println(model);
//        System.out.println(code);
        return model;
    }
}

