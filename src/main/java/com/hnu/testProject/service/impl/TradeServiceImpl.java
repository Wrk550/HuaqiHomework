package com.hnu.testProject.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnu.testProject.utils.PageUtils;
import com.hnu.testProject.utils.Query;

import com.hnu.testProject.dao.TradeDao;
import com.hnu.testProject.entity.TradeEntity;
import com.hnu.testProject.service.TradeService;


@Service("tradeService")
public class TradeServiceImpl extends ServiceImpl<TradeDao, TradeEntity> implements TradeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TradeEntity> page = this.page(
                new Query<TradeEntity>().getPage(params),
                new QueryWrapper<TradeEntity>()
        );

        return new PageUtils(page);
    }

}
