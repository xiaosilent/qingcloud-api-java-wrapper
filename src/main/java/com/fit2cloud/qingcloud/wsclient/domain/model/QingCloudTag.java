package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudTag {

    private String tag_id;
    private String tag_name;
    private String description;
    private Integer resource_count;
    private Integer resource_type_count;
    private List<QingCloudTagPair> resource_tag_pairs;

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getResource_count() {
        return resource_count;
    }

    public void setResource_count(Integer resource_count) {
        this.resource_count = resource_count;
    }

    public Integer getResource_type_count() {
        return resource_type_count;
    }

    public void setResource_type_count(Integer resource_type_count) {
        this.resource_type_count = resource_type_count;
    }

    public List<QingCloudTagPair> getResource_tag_pairs() {
        return resource_tag_pairs;
    }

    public void setResource_tag_pairs(List<QingCloudTagPair> resource_tag_pairs) {
        this.resource_tag_pairs = resource_tag_pairs;
    }
}
