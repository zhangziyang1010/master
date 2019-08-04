package cn.itcast.haoke.dubbo.server.houseResources.service.impl;

import cn.itcast.haoke.dubbo.server.houseResources.entity.TbHouseResources;
import cn.itcast.haoke.dubbo.server.houseResources.mapper.TbHouseResourcesMapper;
import cn.itcast.haoke.dubbo.server.houseResources.service.ITbHouseResourcesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房源表 服务实现类
 * </p>
 *
 * @author itcast
 * @since 2019-08-02
 */
@Service
public class TbHouseResourcesServiceImpl extends ServiceImpl<TbHouseResourcesMapper, TbHouseResources> implements ITbHouseResourcesService {

}
