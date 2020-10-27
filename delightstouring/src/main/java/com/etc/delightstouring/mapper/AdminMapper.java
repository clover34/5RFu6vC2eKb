package com.etc.delightstouring.mapper;

import com.etc.delightstouring.domain.Admin;

import java.util.List;

public interface AdminMapper {
    /**
     * 新增管理员信息
     * @param admin
     * @return
     */
    int add(Admin admin);

    /**
     * 根据管理员编号删除管理员信息
     * @param a_id
     * @return
     */
    int deleteById(String a_id);

    /**
     * 根据管理员编号修改管理员信息
     * @param admin
     * @return
     */
    int updateById(Admin admin);

    /**
     * 根据管理员编号查询信息
     * @param a_id
     * @return
     */
    Admin findById(String a_id);

    /**
     * 根据管理员姓名模糊查询
     * @param a_name
     * @return
     */
    List<Admin> findLikeName(String a_name);

    /**
     * 查询所有管理员信息
     * @return
     */
    List<Admin> findAll();

    /**
     * 根据姓名查找
     * @param a_name
     * @return
     */
    Admin findByName(String a_name);
}
