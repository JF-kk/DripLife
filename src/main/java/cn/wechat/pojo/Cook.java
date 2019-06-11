package cn.wechat.pojo;

public class Cook {
    private Integer id;

    private String userId;

    private String cookMood;

    private String cookSeason;

    private String cookTitle;

    private String cookFood;

    private String cookWay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCookMood() {
        return cookMood;
    }

    public void setCookMood(String cookMood) {
        this.cookMood = cookMood == null ? null : cookMood.trim();
    }

    public String getCookSeason() {
        return cookSeason;
    }

    public void setCookSeason(String cookSeason) {
        this.cookSeason = cookSeason == null ? null : cookSeason.trim();
    }

    public String getCookTitle() {
        return cookTitle;
    }

    public void setCookTitle(String cookTitle) {
        this.cookTitle = cookTitle == null ? null : cookTitle.trim();
    }

    public String getCookFood() {
        return cookFood;
    }

    public void setCookFood(String cookFood) {
        this.cookFood = cookFood == null ? null : cookFood.trim();
    }

    public String getCookWay() {
        return cookWay;
    }

    public void setCookWay(String cookWay) {
        this.cookWay = cookWay == null ? null : cookWay.trim();
    }
}