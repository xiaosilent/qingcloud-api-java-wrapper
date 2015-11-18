package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateRDBResponse {

    private String action;
    private String rdb;
    private Integer ret_code;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRdb() {
        return rdb;
    }

    public void setRdb(String rdb) {
        this.rdb = rdb;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
