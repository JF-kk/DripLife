package cn.wechat.service.serviceImpl;

import cn.wechat.base.BaseData;
import cn.wechat.dao.JournalMapper;
import cn.wechat.pojo.Journal;
import cn.wechat.service.JournalService;
import cn.wechat.util.StateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 日记实现类
* */

@Service("journalService")
public class JournalServiceImpl implements JournalService {
    @Autowired
    private JournalMapper journalMapper;

    @Override
    public BaseData journalAdd(Journal journal) {
        BaseData baseData=new BaseData();
        int result=journalMapper.insert(journal);
        baseData.setResult(result);
        baseData.setJudge(StateUtil.judge(result));
        System.out.println("JournalServiceImpl的journalAdd="+result);
        return baseData;
    }

    @Override
    public List<Journal> selectByOpenid(Journal journal) {
        System.out.println("journalService");
        List<Journal> result=journalMapper.selectByOpenid(journal);
        System.out.println(result);
        return result;
    }

    @Override
    public BaseData deleteById(Journal journal) {
        BaseData baseData=new BaseData();
        int result=journalMapper.deleteById(journal);
        baseData.setJudge(StateUtil.judge(result));
        return baseData;
    }

    @Override
    public BaseData updataById(Journal journal) {
        BaseData baseData=new BaseData();
        int result=journalMapper.updateById(journal);
        baseData.setJudge(StateUtil.judge(result));
        return baseData;
    }
}
