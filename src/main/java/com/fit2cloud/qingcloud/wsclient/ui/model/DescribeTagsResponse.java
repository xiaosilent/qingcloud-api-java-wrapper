package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudTag;
import com.google.gson.Gson;

import java.util.List;

public class DescribeTagsResponse {

    private String action;
    private List<QingCloudTag> tag_set;
    private Integer total_count;
    private Integer ret_code;

    public static DescribeTagsResponse fromJson(String jsonDescribeTagsResponse) {
        Gson gson = new Gson();
        DescribeTagsResponse response = gson.fromJson(jsonDescribeTagsResponse, DescribeTagsResponse.class);
        return response;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudTag> getTag_set() {
        return tag_set;
    }

    public void setTag_set(List<QingCloudTag> tag_set) {
        this.tag_set = tag_set;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
