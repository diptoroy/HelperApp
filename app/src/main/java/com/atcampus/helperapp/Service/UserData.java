package com.atcampus.helperapp.Service;

import com.atcampus.helperapp.Model.Retrofit.UsersDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserData {

    @GET("/users")
    Call<List<UsersDataModel>> getAllUsers();


}
