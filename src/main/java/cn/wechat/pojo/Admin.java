package cn.wechat.pojo;

public class Admin {
    private Integer id;

    private String adminId;

    private String password;

    private String passwordPast;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPasswordPast() {
        return passwordPast;
    }

    public void setPasswordPast(String passwordPast) {
        this.passwordPast = passwordPast;
    }
}