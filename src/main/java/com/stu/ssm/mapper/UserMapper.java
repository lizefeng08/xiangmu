package com.stu.ssm.mapper;

import com.stu.ssm.domain.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username") String username);

   int registerByUsernameAndPassword(@Param("user") User user);
   User selectByUid(@Param("uid")int uid);

}