package com.etc.delightstouring.domain;

import java.io.Serializable;

public class region implements Serializable {
    private int r_id;
    private String r_name;
    private int p_id;
    private Province province;

    public region() {
    }

    public region(String r_name, int p_id) {
        this.r_name = r_name;
        this.p_id = p_id;
    }

    public region(int r_id, String r_name, int p_id) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.p_id = p_id;
    }

    @Override
    public String toString() {
        return "region{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", p_id=" + p_id +
                '}';
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
