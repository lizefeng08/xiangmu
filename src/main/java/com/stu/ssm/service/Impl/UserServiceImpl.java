package com.stu.ssm.service.Impl;

import com.stu.ssm.domain.entity.User;
import com.stu.ssm.mapper.UserMapper;
import com.stu.ssm.service.UserService;
import com.stu.ssm.utils.EntityUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    /*
     * 检验用户登录业务
     *
     */


    public EntityUtil<User> checkLogin(User user) {
        User byUsername = userMapper.findByUsername(user.getUsername());
        // 如果为null，说明用户名不存在
        if (byUsername == null) {
            return EntityUtil.fail("账号错误",400);
        }
        if (!byUsername.getPassword().equals(user.getPassword())) {
            return EntityUtil.fail("密码错误",401);
        }

        return EntityUtil.success(user);
    }



    @Override
    public EntityUtil<User> Regist(User user) {
        User byNm = userMapper.findByUsername(user.getUsername());
        if (byNm != null) {
            return EntityUtil.fail("用户名已存在",409);

        }
        userMapper.registerByUsernameAndPassword(user);
        Integer uid = user.getUid();
        User user1 = userMapper.selectByUid(uid);
        return EntityUtil.yes(user1);
    }
}