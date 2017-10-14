package com.snail.dao;

import com.snail.pojo.domain.Employee;
import com.snail.pojo.domain.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `employee`",
        "where `employee_id` = #{employeeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `employee` (`employee_id`, `login_name`, ",
        "`password`, `name`, `level`, ",
        "`position`, `icon_url`, ",
        "`life_pic_url`, `introduction`, ",
        "`motto`, `mobile`, `email`, ",
        "`gender`, `create_time`, ",
        "`update_time`)",
        "values (#{employeeId,jdbcType=INTEGER}, #{loginName,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{level,jdbcType=INTEGER}, ",
        "#{position,jdbcType=VARCHAR}, #{iconUrl,jdbcType=VARCHAR}, ",
        "#{lifePicUrl,jdbcType=VARCHAR}, #{introduction,jdbcType=VARCHAR}, ",
        "#{motto,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`employee_id`, `login_name`, `password`, `name`, `level`, `position`, `icon_url`, ",
        "`life_pic_url`, `introduction`, `motto`, `mobile`, `email`, `gender`, `create_time`, ",
        "`update_time`",
        "from `employee`",
        "where `employee_id` = #{employeeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Employee selectByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated
     */
    @Update({
        "update `employee`",
        "set `login_name` = #{loginName,jdbcType=VARCHAR},",
          "`password` = #{password,jdbcType=CHAR},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`level` = #{level,jdbcType=INTEGER},",
          "`position` = #{position,jdbcType=VARCHAR},",
          "`icon_url` = #{iconUrl,jdbcType=VARCHAR},",
          "`life_pic_url` = #{lifePicUrl,jdbcType=VARCHAR},",
          "`introduction` = #{introduction,jdbcType=VARCHAR},",
          "`motto` = #{motto,jdbcType=VARCHAR},",
          "`mobile` = #{mobile,jdbcType=VARCHAR},",
          "`email` = #{email,jdbcType=VARCHAR},",
          "`gender` = #{gender,jdbcType=CHAR},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP}",
        "where `employee_id` = #{employeeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Employee record);
}