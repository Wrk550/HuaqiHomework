package com.hnu.testProject.dao;

import com.hnu.testProject.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wrk
 * @email 791354961@qq.com
 * @date 2023-06-20 23:17:47
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
