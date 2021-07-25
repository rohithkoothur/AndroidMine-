package com.example.livenewsmalayalam.models;

public class SingleItemModel {


    private String name;
    private String url;
    private String description;
    public int mImageResource;



    public SingleItemModel() {
    }

    public SingleItemModel(String name, String url,int mImageResource) {
        this.name = name;
        this.url = url;
        this.mImageResource = mImageResource;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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