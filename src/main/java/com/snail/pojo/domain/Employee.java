package com.snail.pojo.domain;

import java.util.Date;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_id
     *
     * @mbggenerated
     */
    private Integer employeeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.level
     *
     * @mbggenerated
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.position
     *
     * @mbggenerated
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.icon_url
     *
     * @mbggenerated
     */
    private String iconUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.life_pic_url
     *
     * @mbggenerated
     */
    private String lifePicUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.motto
     *
     * @mbggenerated
     */
    private String motto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    public Employee(Integer employeeId, String loginName, String password, String name, Integer level, String position, String iconUrl, String lifePicUrl, String introduction, String motto, String mobile, String email, String gender, Date createTime, Date updateTime) {
        this.employeeId = employeeId;
        this.loginName = loginName;
        this.password = password;
        this.name = name;
        this.level = level;
        this.position = position;
        this.iconUrl = iconUrl;
        this.lifePicUrl = lifePicUrl;
        this.introduction = introduction;
        this.motto = motto;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    public Employee() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_id
     *
     * @return the value of employee.employee_id
     *
     * @mbggenerated
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_id
     *
     * @param employeeId the value for employee.employee_id
     *
     * @mbggenerated
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.login_name
     *
     * @return the value of employee.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.login_name
     *
     * @param loginName the value for employee.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.password
     *
     * @return the value of employee.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.password
     *
     * @param password the value for employee.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.level
     *
     * @return the value of employee.level
     *
     * @mbggenerated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.level
     *
     * @param level the value for employee.level
     *
     * @mbggenerated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.position
     *
     * @return the value of employee.position
     *
     * @mbggenerated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.position
     *
     * @param position the value for employee.position
     *
     * @mbggenerated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.icon_url
     *
     * @return the value of employee.icon_url
     *
     * @mbggenerated
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.icon_url
     *
     * @param iconUrl the value for employee.icon_url
     *
     * @mbggenerated
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.life_pic_url
     *
     * @return the value of employee.life_pic_url
     *
     * @mbggenerated
     */
    public String getLifePicUrl() {
        return lifePicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.life_pic_url
     *
     * @param lifePicUrl the value for employee.life_pic_url
     *
     * @mbggenerated
     */
    public void setLifePicUrl(String lifePicUrl) {
        this.lifePicUrl = lifePicUrl == null ? null : lifePicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.introduction
     *
     * @return the value of employee.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.introduction
     *
     * @param introduction the value for employee.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.motto
     *
     * @return the value of employee.motto
     *
     * @mbggenerated
     */
    public String getMotto() {
        return motto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.motto
     *
     * @param motto the value for employee.motto
     *
     * @mbggenerated
     */
    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.mobile
     *
     * @return the value of employee.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.mobile
     *
     * @param mobile the value for employee.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.email
     *
     * @return the value of employee.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.email
     *
     * @param email the value for employee.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbggenerated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbggenerated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.create_time
     *
     * @return the value of employee.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.create_time
     *
     * @param createTime the value for employee.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.update_time
     *
     * @return the value of employee.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.update_time
     *
     * @param updateTime the value for employee.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}