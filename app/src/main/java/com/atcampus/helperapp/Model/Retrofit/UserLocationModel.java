package com.atcampus.helperapp.Model.Retrofit;

import com.google.gson.annotations.SerializedName;

public class UserLocationModel {

    @SerializedName("lat")
    private String latitude;

    @SerializedName("lng")
    private String longitude;

    public UserLocationModel(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
