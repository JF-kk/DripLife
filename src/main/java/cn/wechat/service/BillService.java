package cn.wechat.service;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.Bill;

import java.util.List;

public interface BillService {

    BaseData billAdd(Bill bill);
    List<Bill>selectByOpenid(Bill bill);
    List<Bill>selectById(Bill bill);
    BaseData deleteById(Bill bill);
    BaseData updataById(Bill bill);
}
