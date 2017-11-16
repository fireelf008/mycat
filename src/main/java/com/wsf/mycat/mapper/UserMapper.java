package com.wsf.mycat.mapper;

import com.wsf.mycat.entity.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    void begin();

    void xa();

    void commit();

    void rollback();
}