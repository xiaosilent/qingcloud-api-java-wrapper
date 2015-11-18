package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;

public class DeleteTagsRequest extends Request {

    public List<String> tags;
    public String zone;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
