package com.lying.test.pojo;

public class User {
    private String userId;

    private String username;

    private String password;

    private String phoneNum;

    public User(String userId, String username, String password, String phoneNum) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }
}