package com.example.hotelmanagementbackgroud.model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private Integer issupper;

    private Integer isuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getIssupper() {
        return issupper;
    }

    public void setIssupper(Integer issupper) {
        this.issupper = issupper;
    }

    public Integer getIsuser() {
        return isuser;
    }

    public void setIsuser(Integer isuser) {
        this.isuser = isuser;
    }
}