package com.etc.delightstouring.service;

import com.etc.delightstouring.domain.Admin;

public interface AdminService {

    /**
     * 新增
     * @param admin
     * @return
     */
    boolean add(Admin admin);

    /**
     * 根据管理员编号删除
     * @param a_id
     * @return
     */
    boolean deleteById(String a_id);

    /**
     * 根据管理员编号修改
     * @param admin
     * @return
     */
    boolean updateById(Admin admin);
}
