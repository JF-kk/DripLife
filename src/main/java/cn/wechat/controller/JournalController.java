package cn.wechat.controller;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.Journal;
import cn.wechat.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
* 日记
* */
@Controller
@RequestMapping(value = "/journal")
public class JournalController {
    @Autowired
    private JournalService journalService;

    /*
    * 日记的添加
    * @params( Journal )
    * @return BaseData
    * */
    @RequestMapping(value = "/add")
    @ResponseBody
    public BaseData journalAddCountroller(Journal journal){
        BaseData baseData=journalService.journalAdd(journal);
        return baseData;
    }

    /*
     * 用户日记的全部查找
     * @params( openid )
     * @return
     * */
    @RequestMapping(value = "/selectByOpenid")
    @ResponseBody
    public List<Journal> selectByOpenidCountroller(Journal journal){
        List<Journal> result =journalService.selectByOpenid(journal);
        return result;
    }

    /*
     * 日记的删除
     * @params( id )
     * @return BaseData
     * */
    @RequestMapping( value = "/deleteById")
    @ResponseBody
    public BaseData deleteCountroller(Journal journal){
        BaseData baseData=journalService.deleteById(journal);
        return baseData;

    }

    /*
     * 日记的更新
     * @params( id )
     * @return BaseData
     * */
    @RequestMapping(value = "/updataById")
    @ResponseBody
    public BaseData updataCountroller(Journal journal){
        BaseData baseData=journalService.updataById(journal);
        return baseData;
    }

}
