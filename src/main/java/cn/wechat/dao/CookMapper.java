package cn.wechat.dao;

import cn.wechat.pojo.Cook;

import java.util.List;

public interface CookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cook record);

    int insertSelective(Cook record);

    Cook selectByPrimaryKey(Integer id);

    List<Cook> selectByChoose(Cook record);

    int updateByPrimaryKeySelective(Cook record);

    int updateByPrimaryKey(Cook record);
}