package cn.wechat.dao;

import cn.wechat.pojo.Journal;

import java.util.List;

public interface JournalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Journal record);

    int insertSelective(Journal record);

    Journal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKey(Journal record);

    List<Journal> selectByOpenid(Journal record);
    int deleteById(Journal record);
    int updateById(Journal record);
}