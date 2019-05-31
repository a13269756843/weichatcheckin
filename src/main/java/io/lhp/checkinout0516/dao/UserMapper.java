package io.lhp.checkinout0516.dao;

import io.lhp.checkinout0516.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(String openid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}