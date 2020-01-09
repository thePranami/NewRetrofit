package com.thepranami.newretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Android {
    @SerializedName("ver")
    @Expose
    private String ver;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("api")
    @Expose
    private String api;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Android withVer(String ver) {
        this.ver = ver;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Android withName(String name) {
        this.name = name;
        return this;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Android withApi(String api) {
        this.api = api;
        return this;
    }

}