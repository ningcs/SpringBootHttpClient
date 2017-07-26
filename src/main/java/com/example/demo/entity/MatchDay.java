package com.example.demo.entity;

/**
 * Created by songrenfei on 2017/7/3.
 */

public class MatchDay {


    private Integer id;

    private String dayInfo;

    private String dayInfoDetail;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDayInfo() {
        return dayInfo;
    }

    public void setDayInfo(String dayInfo) {
        this.dayInfo = dayInfo;
    }

    public String getDayInfoDetail() {
        return dayInfoDetail;
    }

    public void setDayInfoDetail(String dayInfoDetail) {
        this.dayInfoDetail = dayInfoDetail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
