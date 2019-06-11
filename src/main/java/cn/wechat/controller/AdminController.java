package cn.wechat.controller;

import cn.wechat.base.BaseData;
import cn.wechat.pojo.Admin;
import cn.wechat.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/*
* 管理员端
* */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

     /*
     * 管理员的登录
     * */
/*    @RequestMapping(value = "/login")
    @ResponseBody
    public BaseData adminLoginController(Admin admin, HttpSession session ){
//        创建Session对象保存user
        BaseData baseData=adminService.login(admin);
        if(baseData.getJudge()=="true"){
            session.setAttribute("admin",admin);
            baseData.setChange(admin.getAdminId());
        }
        return baseData;
    }*/

    /*
     * 管理员的登录
     * */
    @RequestMapping(value = "/login")
    @ResponseBody
    public BaseData adminLoginController(Admin admin, HttpSession session ){

        BaseData baseData=adminService.login(admin,session);
        if(baseData.getJudge()=="true"){
            baseData.setChange(admin.getAdminId());
        }
        return baseData;
    }
    /*
     * 获取 Session
     * */
    @RequestMapping(value = "/adminCheck")
    @ResponseBody
    public Admin adminCheckController(HttpServletRequest request , HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        //获取session值
        HttpSession session = request.getSession();
        Object admin = session.getAttribute("admin");
        return (Admin) admin;
    }
    /*
     * 管理员权限判断
    */
    @RequestMapping(value = "/check")
    @ResponseBody
    public String adminCheck(){

        System.out.println("ddd");
        return "";
    }

    /*
    * 管理员个人信息查看
    * */

    /*
     * 管理员添加
     * @return Integer
     * */
    @RequestMapping(value = "/add")
    @ResponseBody
    public BaseData adminAdd(Admin admin){
        BaseData baseData=adminService.adminAdd(admin);
        return baseData;
    }

    /*
     * 管理员修改
     * @return Integer
     * */
    @RequestMapping(value = "/adminUpdata")
    @ResponseBody
    public BaseData adminUpdata(Admin admin){
        BaseData baseData=adminService.adminUpdata(admin);
        return baseData;
    }
}
