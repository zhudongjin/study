package com.hstypay.admin.controller.cms.base.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Vincent
 * @version 1.0 2017-06-28 11:51
 */
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 界面查询开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    /**
     * 界面查询结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    /**
     * 创建用户
     */
    private Long createUser;
    /**
     * 创建用户名称
     */
    private String createUserName;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 修改用户
     */
    private Long updateUser;

    /**
     * 修改用户名称
     */
    private String updateUserName;

    /**
     * 最后一次更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /**
     * 物理标识
     */
    private Integer physicsFlag;

    /**
     * 当前查询用户
     */
    private Long queryUser;

    public BaseDTO() {

    }

    public BaseDTO(Long createUser, String createUserName) {
        this.createUser = createUser;
        this.createUserName = createUserName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
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

    public Integer getPhysicsFlag() {
        return physicsFlag;
    }

    public void setPhysicsFlag(Integer physicsFlag) {
        this.physicsFlag = physicsFlag;
    }

    public Long getQueryUser() {
        return queryUser;
    }

    public void setQueryUser(Long queryUser) {
        this.queryUser = queryUser;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}
