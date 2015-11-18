package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;
import java.util.Map;

public class CreateRDBRequest extends Request {

    private String vxnet;
    private String rdb_engine;
    private String engine_version;
    private String rdb_username;
    private String rdb_password;
    private Integer rdb_type;
    private Integer storage_size;
    private String rdb_name;
    private List<Map<String, String>> private_ips;
    private String description;
    private Integer auto_backup_time;
    private String zone;

    public String getVxnet() {
        return vxnet;
    }

    public void setVxnet(String vxnet) {
        this.vxnet = vxnet;
    }

    public String getRdb_engine() {
        return rdb_engine;
    }

    public void setRdb_engine(String rdb_engine) {
        this.rdb_engine = rdb_engine;
    }

    public String getEngine_version() {
        return engine_version;
    }

    public void setEngine_version(String engine_version) {
        this.engine_version = engine_version;
    }

    public String getRdb_username() {
        return rdb_username;
    }

    public void setRdb_username(String rdb_username) {
        this.rdb_username = rdb_username;
    }

    public String getRdb_password() {
        return rdb_password;
    }

    public void setRdb_password(String rdb_password) {
        this.rdb_password = rdb_password;
    }

    public Integer getRdb_type() {
        return rdb_type;
    }

    public void setRdb_type(Integer rdb_type) {
        this.rdb_type = rdb_type;
    }

    public Integer getStorage_size() {
        return storage_size;
    }

    public void setStorage_size(Integer storage_size) {
        this.storage_size = storage_size;
    }

    public String getRdb_name() {
        return rdb_name;
    }

    public void setRdb_name(String rdb_name) {
        this.rdb_name = rdb_name;
    }

    public List<Map<String, String>> getPrivate_ips() {
        return private_ips;
    }

    public void setPrivate_ips(List<Map<String, String>> private_ips) {
        this.private_ips = private_ips;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAuto_backup_time() {
        return auto_backup_time;
    }

    public void setAuto_backup_time(Integer auto_backup_time) {
        this.auto_backup_time = auto_backup_time;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
