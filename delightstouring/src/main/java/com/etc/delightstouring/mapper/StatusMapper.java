package com.etc.delightstouring.mapper;

import com.etc.delightstouring.domain.Status;

import java.util.List;

/**
 * @interface StatusMapper
 * @Description TODO
 * @Author Administrator
 * @Date 20/10/27 11:25
 * @Version 1.0
 **/
public interface StatusMapper {
    /**
     * 增：新增一条记录
     * @param status
     * @return
     */
    int addStatus(Status status);

    /**
     *  删：根据编号删除一条记录
     * @param sid
     * @return
     */
    int delStatusById(Integer sid);

    /**
     * 改：根据编号修改一条记录
     * @param status
     * @return
     */
    int updateStatusById(Status status);

    /**
     * 查：查询所有记录信息
     * @return
     */
    List<Status> findAllStatus();

    /**
     * 查：根据编号查询记录
     * @param sid
     * @return
     */
    Status findStatusById(Integer sid);

    /**
     * 查：根据名称查询记录
     * @param sName
     * @return
     */
    Status findStatusByName(String sName);

    /**
     * 查询总记录数
     * @return
     */
    int findCount();
}
