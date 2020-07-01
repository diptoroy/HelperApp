package com.atcampus.helperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.atcampus.helperapp.Adapter.RetrofitAdapter;
import com.atcampus.helperapp.Model.Retrofit.UsersDataModel;
import com.atcampus.helperapp.Service.ApiClient;
import com.atcampus.helperapp.Service.UserData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    private RecyclerView retrofitRecyclerview;
    private List<UsersDataModel> usersDatumModels;
    private RetrofitAdapter retrofitAdapter;
    private UserData userDataInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        retrofitRecyclerview = findViewById(R.id.retrofitRecyclerview);
        usersDatumModels = new ArrayList<>();
        retrofitRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        retrofitAdapter = new RetrofitAdapter(getApplicationContext(), usersDatumModels);
        retrofitRecyclerview.setAdapter(retrofitAdapter);

        userDataInterface = ApiClient.getRetrofit().create(UserData.class);
        Call<List<UsersDataModel>> call = userDataInterface.getAllUsers();
        call.enqueue(new Callback<List<UsersDataModel>>() {

            @Override
            public void onResponse(Call<List<UsersDataModel>> call, Response<List<UsersDataModel>> response) {
                usersDatumModels = response.body();
                Log.d("TAG","Response = "+usersDatumModels);
                retrofitAdapter.setUsersDataModelList(usersDatumModels);
            }

            @Override
            public void onFailure(Call<List<UsersDataModel>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }
        });



    }

}