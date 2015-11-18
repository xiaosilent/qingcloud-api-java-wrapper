package com.fit2cloud.qingcloud.wsclient.ui.model;


import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudTagResourcePair;

import java.util.List;

public class AttachTagsRequest extends Request {

    private List<QingCloudTagResourcePair> resource_tag_pairs;
    private String zone;

    public List<QingCloudTagResourcePair> getResource_tag_pairs() {
        return resource_tag_pairs;
    }

    public void setResource_tag_pairs(List<QingCloudTagResourcePair> resource_tag_pairs) {
        this.resource_tag_pairs = resource_tag_pairs;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
