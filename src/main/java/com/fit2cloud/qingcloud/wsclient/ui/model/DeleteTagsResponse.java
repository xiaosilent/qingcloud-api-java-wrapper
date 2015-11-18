package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class DeleteTagsResponse {

    private String action;
    private List<String> tags;
    private Integer ret_code;

    public static DeleteTagsResponse fromJson(String jsonDeleteTagsResponse) {
        Gson gson = new Gson();
        return gson.fromJson(jsonDeleteTagsResponse, DeleteTagsResponse.class);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
