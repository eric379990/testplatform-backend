package com.zxjt.testplatform.model;

import java.util.Date;

public class ServiceInfo {
    private Long id;

    private String serviceType;

    private String serviceFunctionId;

    private String serviceDesc;

    private String allowOutweb;

    private Date recGenTime;

    private Date recUpdTime;

    private String serviceContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceFunctionId() {
        return serviceFunctionId;
    }

    public void setServiceFunctionId(String serviceFunctionId) {
        this.serviceFunctionId = serviceFunctionId == null ? null : serviceFunctionId.trim();
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc == null ? null : serviceDesc.trim();
    }

    public String getAllowOutweb() {
        return allowOutweb;
    }

    public void setAllowOutweb(String allowOutweb) {
        this.allowOutweb = allowOutweb == null ? null : allowOutweb.trim();
    }

    public Date getRecGenTime() {
        return recGenTime;
    }

    public void setRecGenTime(Date recGenTime) {
        this.recGenTime = recGenTime;
    }

    public Date getRecUpdTime() {
        return recUpdTime;
    }

    public void setRecUpdTime(Date recUpdTime) {
        this.recUpdTime = recUpdTime;
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }
}