package com.atcampus.helperapp.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private List<Integer> viewPagerImagesList;

    public ViewPagerAdapter(List<Integer> productsImagesList) {
        this.viewPagerImagesList = productsImagesList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView productImages = new ImageView(container.getContext());
        productImages.setImageResource(viewPagerImagesList.get(position));
        container.addView(productImages,0);
        return productImages;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return viewPagerImagesList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
