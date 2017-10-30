package com.snail.pojo.domain;

import java.util.Date;

public class UserLevel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.level_name
     *
     * @mbggenerated
     */
    private String levelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.min_point
     *
     * @mbggenerated
     */
    private Integer minPoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.max_point
     *
     * @mbggenerated
     */
    private Integer maxPoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_level.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    public UserLevel(Integer id, String levelName, Integer minPoint, Integer maxPoint, Date createTime, Date updateTime) {
        this.id = id;
        this.levelName = levelName;
        this.minPoint = minPoint;
        this.maxPoint = maxPoint;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    public UserLevel() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.id
     *
     * @return the value of user_level.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.id
     *
     * @param id the value for user_level.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.level_name
     *
     * @return the value of user_level.level_name
     *
     * @mbggenerated
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.level_name
     *
     * @param levelName the value for user_level.level_name
     *
     * @mbggenerated
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.min_point
     *
     * @return the value of user_level.min_point
     *
     * @mbggenerated
     */
    public Integer getMinPoint() {
        return minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.min_point
     *
     * @param minPoint the value for user_level.min_point
     *
     * @mbggenerated
     */
    public void setMinPoint(Integer minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.max_point
     *
     * @return the value of user_level.max_point
     *
     * @mbggenerated
     */
    public Integer getMaxPoint() {
        return maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.max_point
     *
     * @param maxPoint the value for user_level.max_point
     *
     * @mbggenerated
     */
    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.create_time
     *
     * @return the value of user_level.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.create_time
     *
     * @param createTime the value for user_level.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_level.update_time
     *
     * @return the value of user_level.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_level.update_time
     *
     * @param updateTime the value for user_level.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}