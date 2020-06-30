package com.atcampus.helperapp.Model;

public class GridModel {

    private int gridImage;
    private String gridName;

    public GridModel(int gridImage, String gridName) {
        this.gridImage = gridImage;
        this.gridName = gridName;
    }

    public int getGridImage() {
        return gridImage;
    }

    public void setGridImage(int gridImage) {
        this.gridImage = gridImage;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }
}
