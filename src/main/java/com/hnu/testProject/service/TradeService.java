package com.hnu.testProject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnu.testProject.utils.PageUtils;
import com.hnu.testProject.entity.TradeEntity;

import java.util.Map;

/**
 *
 *
 * @author wrk
 * @email 791354961@qq.com
 * @date 2023-06-20 23:17:47
 */
public interface TradeService extends IService<TradeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

