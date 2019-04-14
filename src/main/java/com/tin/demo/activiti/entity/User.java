package com.tin.demo.activiti.entity;

import java.io.Serializable;

/**
 * Created by Tin on 2019/04/14.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1446380663164184107L;

    private Long userId;
    private String userName;
    private String userAccount;
    private String password;
    private transient String salt;
    private Integer delFlag;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
