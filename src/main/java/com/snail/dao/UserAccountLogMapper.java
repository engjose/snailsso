package com.snail.dao;

import com.snail.pojo.domain.UserAccountLog;
import com.snail.pojo.domain.UserAccountLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserAccountLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int countByExample(UserAccountLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int deleteByExample(UserAccountLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `user_account_log`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `user_account_log` (`id`, `user_id`, ",
        "`source`, `trans_serial`, ",
        "`amount`, `create_time`, ",
        "`update_time`)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{source,jdbcType=INTEGER}, #{transSerial,jdbcType=VARCHAR}, ",
        "#{amount,jdbcType=DECIMAL}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(UserAccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int insertSelective(UserAccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    List<UserAccountLog> selectByExample(UserAccountLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `user_id`, `source`, `trans_serial`, `amount`, `create_time`, `update_time`",
        "from `user_account_log`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserAccountLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserAccountLog record, @Param("example") UserAccountLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserAccountLog record, @Param("example") UserAccountLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_log
     *
     * @mbggenerated
     */
    @Update({
        "update `user_account_log`",
        "set `user_id` = #{userId,jdbcType=INTEGER},",
          "`source` = #{source,jdbcType=INTEGER},",
          "`trans_serial` = #{transSerial,jdbcType=VARCHAR},",
          "`amount` = #{amount,jdbcType=DECIMAL},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserAccountLog record);
}