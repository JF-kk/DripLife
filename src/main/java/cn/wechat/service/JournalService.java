package cn.wechat.service;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.Journal;


import java.util.List;

public interface JournalService {

    BaseData journalAdd(Journal journal);
    public List<Journal> selectByOpenid(Journal journal);
    public BaseData deleteById(Journal journal);
    public BaseData updataById(Journal journal);
}
