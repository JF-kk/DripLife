package cn.wechat.pojo;

import java.util.Date;

public class Journal {
    private Integer id;

    private String openid;

    private String journalTitle;

    private String journalContent;

    private Date journalDate;

    private String journalWeek;

    private String journalMood;

    private String weather;

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

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle == null ? null : journalTitle.trim();
    }

    public String getJournalContent() {
        return journalContent;
    }

    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent == null ? null : journalContent.trim();
    }

    public Date getJournalDate() {
        return journalDate;
    }

    public void setJournalDate(Date journalDate) {
        this.journalDate = journalDate;
    }

    public String getJournalWeek() {
        return journalWeek;
    }

    public void setJournalWeek(String journalWeek) {
        this.journalWeek = journalWeek == null ? null : journalWeek.trim();
    }

    public String getJournalMood() {
        return journalMood;
    }

    public void setJournalMood(String journalMood) {
        this.journalMood = journalMood == null ? null : journalMood.trim();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }
}