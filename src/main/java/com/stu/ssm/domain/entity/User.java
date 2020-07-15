package com.stu.ssm.domain.entity;

import java.util.Date;

/**
 * 用户登录注册信息表
 */
public class User {
    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 0表示用户激活 1表示用户未激活
     */
    private Integer status;

    /**
     * 0表示是学生 , 1表示是教师
     */
    private Integer isMer;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsMer() {
        return isMer;
    }

    public void setIsMer(Integer isMer) {
        this.isMer = isMer;
    }
}