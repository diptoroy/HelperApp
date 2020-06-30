package com.atcampus.helperapp.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atcampus.helperapp.Model.GridModel;
import com.atcampus.helperapp.R;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    List<GridModel> gridList;

    public GridAdapter(List<GridModel> gridList) {
        this.gridList = gridList;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        final View view;

        if (convertView == null){

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_row,null);
            view.setElevation(0);
//            view.setBackgroundColor(Color.parseColor("#fffffff"));
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent productDetails = new Intent(parent.getContext(), ProductDetailsActivity.class);
//                    parent.getContext().startActivity(productDetails);
                }
            });

            ImageView trendingImage = view.findViewById(R.id.dealsitem_image);
            TextView trendingName = view.findViewById(R.id.dealsitem_name);


            trendingImage.setImageResource(gridList.get(position).getGridImage());
            trendingName.setText(gridList.get(position).getGridName());

        }else{
            view = convertView;
        }
        return view;
    }
}
