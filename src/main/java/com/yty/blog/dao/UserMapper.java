package com.yty.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yty.blog.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
