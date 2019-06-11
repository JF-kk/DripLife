package cn.wechat.service.serviceImpl;

import cn.wechat.base.BaseData;
import cn.wechat.dao.AdminMapper;
import cn.wechat.pojo.Admin;
import cn.wechat.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;


/*
 *   serviceImpl 页面实现类
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin test(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }

     /*
     *  管理员登录页面
     *  @return
     **/
   /* public BaseData login(Admin admin){
        BaseData baseData=new BaseData();
        Admin result=adminMapper.selectBykey(admin.getAdminId());
        if(result.getPassword().equals(admin.getPassword())){
            baseData.setJudge("true");
            return baseData;
        }
        else {
            baseData.setJudge("false");
            return baseData;
        }
    }*/

    /*
     *  管理员登录页面 有 session
     *  @return
     **/
    @Override
    public BaseData login(Admin admin , HttpSession session) {
        BaseData baseData=new BaseData();
        Admin result=adminMapper.selectBykey(admin.getAdminId());
        if(result.getPassword().equals(admin.getPassword())){
            baseData.setJudge("true");
            //  Session对象保存 admin
            session.setAttribute("admin",result);
            return baseData;
        }
        else {
            baseData.setJudge("false");
            return baseData;
        }

    }


    /*
     * 管理员添加
     * */
    @Override
    public BaseData adminAdd(Admin admin) {
        BaseData baseData=new BaseData();
        Integer result=adminMapper.insert(admin);
        baseData.setResult(result);
        return baseData;
    }

    /*
     * 管理员更新
     * */
    @Override
    public BaseData adminUpdata(Admin admin) {
        BaseData baseData=new BaseData();
        Integer result=adminMapper.updateByAdminId(admin);
        if (result!=null){
            baseData.setJudge("true");
        }
        else{
            baseData.setJudge("false");
        }
        return baseData;
    }
}