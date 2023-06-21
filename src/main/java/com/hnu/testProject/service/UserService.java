package com.hnu.testProject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnu.testProject.utils.PageUtils;
import com.hnu.testProject.entity.UserEntity;

import java.util.Map;

/**
 *
 *
 * @author wrk
 * @email 791354961@qq.com
 * @date 2023-06-20 23:17:47
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

