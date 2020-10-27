package com.etc.delightstouring.domain;

public class Admin {
    private String UUID; // uuid
    private String a_id; //管理员编号
    private String a_name; // 管理员姓名
    private String password; // 密码
    private String a_phone; // 联系方式
    private String a_role; //  角色

    public Admin() {
    }

    public Admin(String UUID, String a_id, String a_name, String password, String a_phone, String a_role) {
        this.UUID = UUID;
        this.a_id = a_id;
        this.a_name = a_name;
        this.password = password;
        this.a_phone = a_phone;
        this.a_role = a_role;
    }

    public Admin(String a_id, String a_name, String password, String a_phone, String a_role) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.password = password;
        this.a_phone = a_phone;
        this.a_role = a_role;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getA_phone() {
        return a_phone;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public String getA_role() {
        return a_role;
    }

    public void setA_role(String a_role) {
        this.a_role = a_role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "UUID='" + UUID + '\'' +
                ", a_id='" + a_id + '\'' +
                ", a_name='" + a_name + '\'' +
                ", password='" + password + '\'' +
                ", a_phone='" + a_phone + '\'' +
                ", a_role='" + a_role + '\'' +
                '}';
    }
}
