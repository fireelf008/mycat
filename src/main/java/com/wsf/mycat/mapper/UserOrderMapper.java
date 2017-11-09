package com.wsf.mycat.mapper;

import com.wsf.mycat.entity.model.UserOrder;
import java.util.List;

public interface UserOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserOrder record);

    UserOrder selectByPrimaryKey(Long id);

    List<UserOrder> selectAll();

    int updateByPrimaryKey(UserOrder record);
}