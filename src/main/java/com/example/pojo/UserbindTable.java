package com.example.pojo;

public class UserbindTable {
    private Integer id;

    private String userName;

    private String bindName;

    private String bindPhone;

    private String bindState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBindName() {
        return bindName;
    }

    public void setBindName(String bindName) {
        this.bindName = bindName == null ? null : bindName.trim();
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone == null ? null : bindPhone.trim();
    }

    public String getBindState() {
        return bindState;
    }

    public void setBindState(String bindState) {
        this.bindState = bindState == null ? null : bindState.trim();
    }
}