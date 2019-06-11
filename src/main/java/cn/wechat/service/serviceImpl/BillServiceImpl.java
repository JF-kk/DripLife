package cn.wechat.service.serviceImpl;

import cn.wechat.base.BaseData;
import cn.wechat.dao.BillMapper;
import cn.wechat.pojo.Bill;
import cn.wechat.service.BillService;
import cn.wechat.util.StateUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 账单实现类
*
* */
@Service("billService")
public class BillServiceImpl implements BillService {
    private BillMapper billMapper;

    /*
    * 用户账单的添加
    * @param ( Bill )
    * @return BaseData
    * */
    @Override
    public BaseData billAdd(Bill bill) {
        BaseData baseData=new BaseData();
        int result=billMapper.insert(bill);
        baseData.setResult(result);
        baseData.setJudge(StateUtil.judge(result));
        return baseData;
    }

    /*
    * 用户账单的全部查找 （根据 openid 查找全部）
    * @param( openid )
    * @return List<>
    * */
    @Override
    public List<Bill> selectById(Bill bill) {
        System.out.println("billService");
        List<Bill> result=billMapper.selectById(bill);
        System.out.println(result);
        return result;
    }

    /*
     * 用户账单的条件查找 （根据 id）
     * @param( openid )
     * @return List<>
     * */
    @Override
    public List<Bill> selectByOpenid(Bill bill) {
        System.out.println("billService");
        List<Bill> result=billMapper.selectByOpenid(bill);
        System.out.println(result);
        return result;
    }

    /*
    * 用户账单的删除
    * @param ( id )
    * @return BaseData
    * */
    @Override
    public BaseData deleteById(Bill bill) {
        BaseData baseData=new BaseData();
        int result=billMapper.deleteById(bill);
        baseData.setJudge(StateUtil.judge(result));
        return baseData;
    }

    /*
     * 用户账单的更新
     * @param ( id )
     * @return BaseData
     * */
    @Override
    public BaseData updataById(Bill bill) {
        BaseData baseData=new BaseData();
        int result=billMapper.updateById(bill);
        baseData.setJudge(StateUtil.judge(result));
        return baseData;
    }
}
