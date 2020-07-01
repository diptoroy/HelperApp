package com.atcampus.helperapp.Model.Retrofit;

import com.google.gson.annotations.SerializedName;

public class UserCompany {

    @SerializedName("name")
    private String companyname;

    @SerializedName("bs")
    private String bs;

    public UserCompany(String companyname, String bs) {
        this.companyname = companyname;
        this.bs = bs;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
