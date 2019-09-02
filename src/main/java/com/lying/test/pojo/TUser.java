package com.lying.test.pojo;

public class TUser {
    private Integer userId;

    private String username;

    private String password;

    private String nickname;

    private String telphone;

    private String address;

    public TUser(Integer userId, String username, String password, String nickname, String telphone, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.telphone = telphone;
        this.address = address;
    }

    public TUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}