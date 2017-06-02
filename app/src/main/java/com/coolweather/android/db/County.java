package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 侯彦兵 on 2017/6/2.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private String cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
