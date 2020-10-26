package com.etc.delightstouring.domain;

import java.io.Serializable;

/**
 * @ClassName Province
 * @Description TODO 省份
 * @Author Administrator
 * @Date 20/10/26 18:45
 * @Version 1.0
 **/
public class Province implements Serializable {
    private Integer pId;// 省份编号
    private String pName;// 省份名称

    public Province(Integer pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    public Province(String pName) {
        this.pName = pName;
    }

    public Province() {
    }

    @Override
    public String toString() {
        return "Province{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }
}
