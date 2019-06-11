package cn.wechat.controller;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.Bill;
import cn.wechat.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {
    private BillService billService;

    /*
     * 用户账单的添加
     * @params( Journal )
     * @return BaseData
     * */
    @RequestMapping(value = "/add")
    @ResponseBody
    public BaseData billAddCountroller(Bill bill){
        BaseData baseData=billService.billAdd(bill);
        return baseData;
    }

    /*
     * 用户账单的全部查找
     * @params( openid )
     * @return
     * */
    @RequestMapping(value = "/selectByOpenid")
    @ResponseBody
    public List<Bill> selectByOpenidCountroller(Bill bill){
        List<Bill> result =billService.selectByOpenid(bill);
        return result;
    }

    /*
     * 用户账单的条件查找
     * @params( id )
     * @return
     * */
    @RequestMapping(value = "/selectById")
    @ResponseBody
    public List<Bill> selectByIdCountroller(Bill bill){
        List<Bill> result =billService.selectById(bill);
        return result;
    }

    /*
     * 用户账单的删除
     * @params( id )
     * @return BaseData
     * */
    @RequestMapping( value = "/deleteById")
    @ResponseBody
    public BaseData deleteByIdCountroller(Bill bill){
        BaseData baseData=billService.deleteById(bill);
        return baseData;

    }

    /*
     * 用户账单的更新
     * @params( id )
     * @return BaseData
     * */
    @RequestMapping(value = "/updataById")
    @ResponseBody
    public BaseData updataCountroller(Bill bill){
        BaseData baseData=billService.updataById(bill);
        return baseData;
    }
}
