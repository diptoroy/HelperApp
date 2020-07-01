package com.atcampus.helperapp.Model.Retrofit;

import com.google.gson.annotations.SerializedName;

public class UserAdressModel {

    @SerializedName("street")
    private String street;

    @SerializedName("city")
    private String city;

    @SerializedName("zipcode")
    private String zipcode;

    private UserLocationModel geo;

    public UserAdressModel(String street, String city, String zipcode, UserLocationModel geo) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public UserLocationModel getGeo() {
        return geo;
    }

    public void setGeo(UserLocationModel geo) {
        this.geo = geo;
    }
}
