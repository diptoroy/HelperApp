package com.atcampus.helperapp.Model.Retrofit;

import com.google.gson.annotations.SerializedName;

public class UsersDataModel {

    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    private UserAdressModel address;
    private UserCompany company;

    public UsersDataModel(String name, String username, String email, UserAdressModel address, UserCompany company) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserAdressModel getAddress() {
        return address;
    }

    public void setAddress(UserAdressModel address) {
        this.address = address;
    }

    public UserCompany getCompany() {
        return company;
    }

    public void setCompany(UserCompany company) {
        this.company = company;
    }
}
