package com.stu.ssm.utils;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Data
public class EntityUtil<T> {
    private int status;
    private String msg;
    private T data;
    public static <T> EntityUtil<T> success(T data){
        EntityUtil<T> entityUtil = new EntityUtil<>();
        entityUtil.setMsg("登陆成功");
        entityUtil.setStatus(200);
        entityUtil.setData(data);
        return entityUtil;
    }
    public static <T> EntityUtil<T> yes(T data){
        EntityUtil<T> entityUtil = new EntityUtil<>();
        entityUtil.setMsg("注册成功");
        entityUtil.setStatus(200);
        entityUtil.setData(data);
        return entityUtil;
    }

    public static EntityUtil fail(String msg,int status){
        EntityUtil entityUtil = new EntityUtil();
        entityUtil.setStatus(status);
        entityUtil.setMsg(msg);
        return entityUtil;
    }

}
