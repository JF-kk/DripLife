package cn.wechat.pojo;

import java.util.Date;

public class Bill {
    private Integer id;

    private String openid;

    private String billActivity;

    private String billType;

    private Double billMoney;

    private Date billDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getBillActivity() {
        return billActivity;
    }

    public void setBillActivity(String billActivity) {
        this.billActivity = billActivity == null ? null : billActivity.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
}