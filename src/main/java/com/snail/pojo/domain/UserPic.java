package com.snail.pojo.domain;

import java.util.Date;

public class UserPic {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.hash_code
     *
     * @mbggenerated
     */
    private String hashCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.create_at
     *
     * @mbggenerated
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_pic.update_at
     *
     * @mbggenerated
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pic
     *
     * @mbggenerated
     */
    public UserPic(Integer id, String url, String hashCode, Integer userId, Date createAt, Date updateAt) {
        this.id = id;
        this.url = url;
        this.hashCode = hashCode;
        this.userId = userId;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pic
     *
     * @mbggenerated
     */
    public UserPic() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.id
     *
     * @return the value of user_pic.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.id
     *
     * @param id the value for user_pic.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.url
     *
     * @return the value of user_pic.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.url
     *
     * @param url the value for user_pic.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.hash_code
     *
     * @return the value of user_pic.hash_code
     *
     * @mbggenerated
     */
    public String getHashCode() {
        return hashCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.hash_code
     *
     * @param hashCode the value for user_pic.hash_code
     *
     * @mbggenerated
     */
    public void setHashCode(String hashCode) {
        this.hashCode = hashCode == null ? null : hashCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.user_id
     *
     * @return the value of user_pic.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.user_id
     *
     * @param userId the value for user_pic.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.create_at
     *
     * @return the value of user_pic.create_at
     *
     * @mbggenerated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.create_at
     *
     * @param createAt the value for user_pic.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_pic.update_at
     *
     * @return the value of user_pic.update_at
     *
     * @mbggenerated
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_pic.update_at
     *
     * @param updateAt the value for user_pic.update_at
     *
     * @mbggenerated
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}