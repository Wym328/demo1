package com.example.pojo;

public class ParkuserTable {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String userId;

    private Integer userTicketstate;

    private Integer userParkstate;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getUserTicketstate() {
        return userTicketstate;
    }

    public void setUserTicketstate(Integer userTicketstate) {
        this.userTicketstate = userTicketstate;
    }

    public Integer getUserParkstate() {
        return userParkstate;
    }

    public void setUserParkstate(Integer userParkstate) {
        this.userParkstate = userParkstate;
    }
}