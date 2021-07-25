package com.example.livenewsmalayalam.models;

public class SingleItemModel {


    private String name;
    private String activityname;
    private String description;
    public int mImageResource;



    public SingleItemModel() {
    }

    public SingleItemModel(String name, String activityname,int mImageResource) {
        this.name = name;
        this.activityname = activityname;
        this.mImageResource = mImageResource;
    }


    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public void setImageResource(String name) {
        this.mImageResource = mImageResource;
    }





    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}