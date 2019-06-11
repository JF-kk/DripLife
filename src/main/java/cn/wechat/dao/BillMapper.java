package cn.wechat.dao;

import cn.wechat.pojo.Bill;

import java.util.List;

public interface BillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    List<Bill> selectByOpenid(Bill record);
    List<Bill> selectById(Bill record);
    int deleteById(Bill record);
    int updateById(Bill record);
}