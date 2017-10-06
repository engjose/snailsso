package com.snail.pojo.domain;

import java.util.Date;

public class UserPointLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.point_log_id
     *
     * @mbggenerated
     */
    private Integer pointLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.source
     *
     * @mbggenerated
     */
    private Byte source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.trans_serial
     *
     * @mbggenerated
     */
    private Integer transSerial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.change_pint
     *
     * @mbggenerated
     */
    private Short changePint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_point_log.app
     *
     * @mbggenerated
     */
    private String app;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_log
     *
     * @mbggenerated
     */
    public UserPointLog(Integer pointLogId, Integer userId, Byte source, Integer transSerial, Short changePint, Date createTime, Date updateTime, String app) {
        this.pointLogId = pointLogId;
        this.userId = userId;
        this.source = source;
        this.transSerial = transSerial;
        this.changePint = changePint;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.app = app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_log
     *
     * @mbggenerated
     */
    public UserPointLog() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.point_log_id
     *
     * @return the value of user_point_log.point_log_id
     *
     * @mbggenerated
     */
    public Integer getPointLogId() {
        return pointLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.point_log_id
     *
     * @param pointLogId the value for user_point_log.point_log_id
     *
     * @mbggenerated
     */
    public void setPointLogId(Integer pointLogId) {
        this.pointLogId = pointLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.user_id
     *
     * @return the value of user_point_log.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.user_id
     *
     * @param userId the value for user_point_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.source
     *
     * @return the value of user_point_log.source
     *
     * @mbggenerated
     */
    public Byte getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.source
     *
     * @param source the value for user_point_log.source
     *
     * @mbggenerated
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.trans_serial
     *
     * @return the value of user_point_log.trans_serial
     *
     * @mbggenerated
     */
    public Integer getTransSerial() {
        return transSerial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.trans_serial
     *
     * @param transSerial the value for user_point_log.trans_serial
     *
     * @mbggenerated
     */
    public void setTransSerial(Integer transSerial) {
        this.transSerial = transSerial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.change_pint
     *
     * @return the value of user_point_log.change_pint
     *
     * @mbggenerated
     */
    public Short getChangePint() {
        return changePint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.change_pint
     *
     * @param changePint the value for user_point_log.change_pint
     *
     * @mbggenerated
     */
    public void setChangePint(Short changePint) {
        this.changePint = changePint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.create_time
     *
     * @return the value of user_point_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.create_time
     *
     * @param createTime the value for user_point_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.update_time
     *
     * @return the value of user_point_log.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.update_time
     *
     * @param updateTime the value for user_point_log.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_point_log.app
     *
     * @return the value of user_point_log.app
     *
     * @mbggenerated
     */
    public String getApp() {
        return app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_point_log.app
     *
     * @param app the value for user_point_log.app
     *
     * @mbggenerated
     */
    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }
}