package com.fit2cloud.qingcloud.wsclient.domain.model;


public class QingCloudRDB {

    private String rdb_id;
    private String rdb_name;
    private String master_ip;
    private Integer auto_backup_time;
    private String alarm_status;

    private QingCloudVxnet vxnet;

    private String status;
    private String description;

    private String transition_status;

    private Integer storage_size;
    private Integer rdb_type;
    private Integer auto_minor_ver_upgrade;

    private String engine_version;
    private String rdb_engine;


    private String create_time;
    private String status_time;
    private String lastest_snapshot_time;


    public String getRdb_id() {
        return rdb_id;
    }

    public void setRdb_id(String rdb_id) {
        this.rdb_id = rdb_id;
    }

    public String getRdb_name() {
        return rdb_name;
    }

    public void setRdb_name(String rdb_name) {
        this.rdb_name = rdb_name;
    }

    public String getMaster_ip() {
        return master_ip;
    }

    public void setMaster_ip(String master_ip) {
        this.master_ip = master_ip;
    }

    public Integer getAuto_backup_time() {
        return auto_backup_time;
    }

    public void setAuto_backup_time(Integer auto_backup_time) {
        this.auto_backup_time = auto_backup_time;
    }

    public String getAlarm_status() {
        return alarm_status;
    }

    public void setAlarm_status(String alarm_status) {
        this.alarm_status = alarm_status;
    }

    public QingCloudVxnet getVxnet() {
        return vxnet;
    }

    public void setVxnet(QingCloudVxnet vxnet) {
        this.vxnet = vxnet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransition_status() {
        return transition_status;
    }

    public void setTransition_status(String transition_status) {
        this.transition_status = transition_status;
    }

    public Integer getStorage_size() {
        return storage_size;
    }

    public void setStorage_size(Integer storage_size) {
        this.storage_size = storage_size;
    }

    public Integer getRdb_type() {
        return rdb_type;
    }

    public void setRdb_type(Integer rdb_type) {
        this.rdb_type = rdb_type;
    }

    public Integer getAuto_minor_ver_upgrade() {
        return auto_minor_ver_upgrade;
    }

    public void setAuto_minor_ver_upgrade(Integer auto_minor_ver_upgrade) {
        this.auto_minor_ver_upgrade = auto_minor_ver_upgrade;
    }

    public String getEngine_version() {
        return engine_version;
    }

    public void setEngine_version(String engine_version) {
        this.engine_version = engine_version;
    }

    public String getRdb_engine() {
        return rdb_engine;
    }

    public void setRdb_engine(String rdb_engine) {
        this.rdb_engine = rdb_engine;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time;
    }

    public String getLastest_snapshot_time() {
        return lastest_snapshot_time;
    }

    public void setLastest_snapshot_time(String lastest_snapshot_time) {
        this.lastest_snapshot_time = lastest_snapshot_time;
    }
}
