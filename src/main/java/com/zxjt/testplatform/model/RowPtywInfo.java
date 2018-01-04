package com.zxjt.testplatform.model;

public class RowPtywInfo extends RowPtywInfoKey {
    private String cvalue;

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue == null ? null : cvalue.trim();
    }
}