package com.stu.ssm.service;

import com.stu.ssm.domain.entity.User;
import com.stu.ssm.utils.EntityUtil;

public interface UserService {
    //检验用户登录
  EntityUtil<User> checkLogin(User user);
    EntityUtil<User> Regist(User user);
}

