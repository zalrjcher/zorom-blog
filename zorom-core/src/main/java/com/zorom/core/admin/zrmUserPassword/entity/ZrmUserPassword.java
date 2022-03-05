package com.zorom.core.admin.zrmUserPassword.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户密码表
 * </p>
 *
 * @author zalrjcher
 * @since 2022-02-25
 */
@TableName("zrm_user_password")
public class ZrmUserPassword implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Long aid;

    private String passwd;

    private String salt;

    private Integer passwordType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public Integer getPasswordType() {
        return passwordType;
    }

    public void setPasswordType(Integer passwordType) {
        this.passwordType = passwordType;
    }

    @Override
    public String toString() {
        return "ZrmUserPassword{" +
            "id=" + id +
            ", aid=" + aid +
            ", passwd=" + passwd +
            ", salt=" + salt +
            ", passwordType=" + passwordType +
        "}";
    }
}
