package com.atcampus.helperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.GridView;

import com.atcampus.helperapp.Adapter.GridAdapter;
import com.atcampus.helperapp.Adapter.ViewPagerAdapter;
import com.atcampus.helperapp.Model.GridModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //ViewPager(Slider)
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<Integer> viewPagerImages;

    //GridView
    private GridView gridview;
    private List<GridModel> gridModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager(Slider)
        viewPager = findViewById(R.id.product_images_viewpager);
        tabLayout = findViewById(R.id.image_indicator);

        viewPagerImages = new ArrayList<>();
        viewPagerImages.add(R.drawable.vimg1);
        viewPagerImages.add(R.drawable.vimg2);
        viewPagerImages.add(R.drawable.vimg3);

        ViewPagerAdapter adapter = new ViewPagerAdapter(viewPagerImages);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager, true);

        //GridView
        gridview = findViewById(R.id.gridview);
        gridModels = new ArrayList<>();
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));
        gridModels.add(new GridModel(R.drawable.gridicon,"RecyclerView"));

        gridview.setAdapter(new GridAdapter(gridModels));

    }
}