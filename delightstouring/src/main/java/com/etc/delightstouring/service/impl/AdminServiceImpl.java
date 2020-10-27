package com.etc.delightstouring.service.impl;

import com.etc.delightstouring.domain.Admin;
import com.etc.delightstouring.mapper.AdminMapper;
import com.etc.delightstouring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    /**
     * 新增
     * @param admin
     * @return
     */
    @Override
    public boolean add(Admin admin) {
        if(adminMapper.findByName(admin.getA_name())==null){
            return adminMapper.add(admin)>0?true:false;
        }
        return false;
    }

    /**
     * 根据管理员编号删除
     * @param a_id
     * @return
     */
    @Override
    public boolean deleteById(String a_id) {

        return adminMapper.deleteById(a_id)>0?true:false;
    }

    /**
     * 根据管理员编号修改
     * @param admin
     * @return
     */
    @Override
    public boolean updateById(Admin admin) {
        return adminMapper.updateById(admin)>0?true:false;
    }
}
