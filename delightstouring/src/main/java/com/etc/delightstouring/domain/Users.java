package com.etc.delightstouring.domain;

public class Users {
    private String UUID; // UUID
    private String u_id; // 用户编号
    private String u_photopath; // 头像
    private String username; // 用户名
    private String password; // 密码
    private String u_phone; //手机号码

    public Users() {
    }

    public Users(String UUID, String u_id, String u_photopath, String username, String password, String u_phone) {
        this.UUID = UUID;
        this.u_id = u_id;
        this.u_photopath = u_photopath;
        this.username = username;
        this.password = password;
        this.u_phone = u_phone;
    }

    public Users(String u_id, String u_photopath, String username, String password, String u_phone) {
        this.u_id = u_id;
        this.u_photopath = u_photopath;
        this.username = username;
        this.password = password;
        this.u_phone = u_phone;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_photopath() {
        return u_photopath;
    }

    public void setU_photopath(String u_photopath) {
        this.u_photopath = u_photopath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "UUID='" + UUID + '\'' +
                ", u_id='" + u_id + '\'' +
                ", u_photopath='" + u_photopath + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", u_phone='" + u_phone + '\'' +
                '}';
    }
}
