package com.snail.pojo.domain;

import java.util.Date;

public class UserLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_id
     *
     * @mbggenerated
     */
    private Integer loginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.user_status
     *
     * @mbggenerated
     */
    private Integer userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.user_mobile
     *
     * @mbggenerated
     */
    private String userMobile;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated
     */
    public UserLogin(Integer loginId, Integer userId, String loginName, String password, Integer userStatus, Date createTime, Date updateTime, String userEmail, String userMobile) {
        this.loginId = loginId;
        this.userId = userId;
        this.loginName = loginName;
        this.password = password;
        this.userStatus = userStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userEmail = userEmail;
        this.userMobile = userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated
     */
    public UserLogin() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.login_id
     *
     * @return the value of user_login.login_id
     *
     * @mbggenerated
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.login_id
     *
     * @param loginId the value for user_login.login_id
     *
     * @mbggenerated
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.user_id
     *
     * @return the value of user_login.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.user_id
     *
     * @param userId the value for user_login.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.login_name
     *
     * @return the value of user_login.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.login_name
     *
     * @param loginName the value for user_login.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.password
     *
     * @return the value of user_login.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.password
     *
     * @param password the value for user_login.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.user_status
     *
     * @return the value of user_login.user_status
     *
     * @mbggenerated
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.user_status
     *
     * @param userStatus the value for user_login.user_status
     *
     * @mbggenerated
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.create_time
     *
     * @return the value of user_login.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.create_time
     *
     * @param createTime the value for user_login.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.update_time
     *
     * @return the value of user_login.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.update_time
     *
     * @param updateTime the value for user_login.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.user_email
     *
     * @return the value of user_login.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.user_email
     *
     * @param userEmail the value for user_login.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.user_mobile
     *
     * @return the value of user_login.user_mobile
     *
     * @mbggenerated
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.user_mobile
     *
     * @param userMobile the value for user_login.user_mobile
     *
     * @mbggenerated
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }
}