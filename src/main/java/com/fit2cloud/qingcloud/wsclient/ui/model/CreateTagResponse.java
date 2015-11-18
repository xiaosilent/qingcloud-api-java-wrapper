package com.fit2cloud.qingcloud.wsclient.ui.model;


import com.google.gson.Gson;

public class CreateTagResponse {

    private String action;
    private String tag_id;
    private Integer ret_code;


    public static CreateTagResponse fromJson(String jsonCreateTagResponse) {
        Gson gson = new Gson();
        CreateTagResponse response = gson.fromJson(jsonCreateTagResponse, CreateTagResponse.class);
        return response;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
