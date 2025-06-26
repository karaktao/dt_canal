package com.ruoyi.transport.service;

import java.util.List;
import com.ruoyi.transport.domain.TransportDemand;

/**
 * 物流发布Service接口
 * 
 * @author dt
 * @date 2025-06-25
 */
public interface ITransportDemandService 
{
    /**
     * 查询物流发布
     * 
     * @param id 物流发布主键
     * @return 物流发布
     */
    public TransportDemand selectTransportDemandById(Long id);

    /**
     * 查询物流发布列表
     * 
     * @param transportDemand 物流发布
     * @return 物流发布集合
     */
    public List<TransportDemand> selectTransportDemandList(TransportDemand transportDemand);

    /**
     * 新增物流发布
     * 
     * @param transportDemand 物流发布
     * @return 结果
     */
    public int insertTransportDemand(TransportDemand transportDemand);

    /**
     * 修改物流发布
     * 
     * @param transportDemand 物流发布
     * @return 结果
     */
    public int updateTransportDemand(TransportDemand transportDemand);

    /**
     * 批量删除物流发布
     * 
     * @param ids 需要删除的物流发布主键集合
     * @return 结果
     */
    public int deleteTransportDemandByIds(Long[] ids);

    /**
     * 删除物流发布信息
     * 
     * @param id 物流发布主键
     * @return 结果
     */
    public int deleteTransportDemandById(Long id);
}
