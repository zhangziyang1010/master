package cn.itcast.haoke.dubbo.server.service.impl;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import cn.itcast.haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //spring
@Transactional //事物
public class HouseResourcesServiceImpl extends BaseServiceImpl<HouseResources> implements HouseResourcesService {
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        //校验失败返回-1
        if (StringUtils.isBlank(houseResources.getTitle())){
            return -1;
        }
        //校验成功 0或1
        return super.save(houseResources);
    }
}
