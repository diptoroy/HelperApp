package com.atcampus.helperapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atcampus.helperapp.Model.Retrofit.UsersDataModel;
import com.atcampus.helperapp.R;

import java.util.List;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.ViewHolder> {

    private Context ctx;
    private List<UsersDataModel> usersDataModelList;

    public RetrofitAdapter(Context ctx, List<UsersDataModel> usersDataModelList) {
        this.ctx = ctx;
        this.usersDataModelList = usersDataModelList;
    }

    public void setUsersDataModelList(List<UsersDataModel> usersDataModelList) {
        this.usersDataModelList = usersDataModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RetrofitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.retrofit_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RetrofitAdapter.ViewHolder holder, int position) {
        UsersDataModel usersDataModel = usersDataModelList.get(position);
        holder.name.setText(usersDataModel.getName());
        holder.username.setText(usersDataModel.getUsername());
        holder.usercompany.setText(usersDataModel.getCompany().getCompanyname());
        holder.usermail.setText(usersDataModel.getEmail());
        holder.userbs.setText(usersDataModel.getCompany().getBs());
        holder.usercity.setText(usersDataModel.getAddress().getCity());
        holder.userstreet.setText(usersDataModel.getAddress().getStreet());
        holder.userzipcode.setText(usersDataModel.getAddress().getZipcode());
        holder.uselat.setText(usersDataModel.getAddress().getGeo().getLatitude());
        holder.userlong.setText(usersDataModel.getAddress().getGeo().getLongitude());


    }

    @Override
    public int getItemCount() {
        return usersDataModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,username,usercompany,usermail,userbs,usercity,userstreet,userzipcode,uselat,userlong;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_view);
            username = itemView.findViewById(R.id.username_view);
            usercompany = itemView.findViewById(R.id.user_company_view);
            usermail = itemView.findViewById(R.id.usermail_view);
            userbs = itemView.findViewById(R.id.userbs_view);
            usercity = itemView.findViewById(R.id.usercity_view);
            userstreet = itemView.findViewById(R.id.userstreet_view);
            userzipcode = itemView.findViewById(R.id.usrzipcode_view);
            uselat = itemView.findViewById(R.id.userlat_view);
            userlong = itemView.findViewById(R.id.userlong_view);


        }
    }
}
