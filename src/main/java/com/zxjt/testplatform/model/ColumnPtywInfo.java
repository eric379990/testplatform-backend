package com.zxjt.testplatform.model;

public class ColumnPtywInfo extends ColumnPtywInfoKey {
    private String cname;

    private String desc;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}