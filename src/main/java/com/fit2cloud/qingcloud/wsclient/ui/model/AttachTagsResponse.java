package com.fit2cloud.qingcloud.wsclient.ui.model;


import com.google.gson.Gson;

public class AttachTagsResponse {

    private String action;
    private Integer ret_code;

    public static AttachTagsResponse fromJson(String json) {
        return new Gson().fromJson(json, AttachTagsResponse.class);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
