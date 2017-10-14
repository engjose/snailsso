package com.snail.dao;

import com.snail.pojo.domain.User;
import com.snail.pojo.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `user`",
        "where `user_id` = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `user` (`user_id`, `user_name`, ",
        "`identity_card_type`, `identity_card_no`, ",
        "`mobile`, `email`, `gender`, ",
        "`point`, `register_time`, ",
        "`birthday`, `user_level`, ",
        "`account_money`, `create_time`, ",
        "`update_time`, `app`)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{identityCardType,jdbcType=INTEGER}, #{identityCardNo,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{gender,jdbcType=CHAR}, ",
        "#{point,jdbcType=INTEGER}, #{registerTime,jdbcType=TIMESTAMP}, ",
        "#{birthday,jdbcType=TIMESTAMP}, #{userLevel,jdbcType=INTEGER}, ",
        "#{accountMoney,jdbcType=DECIMAL}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{app,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`user_id`, `user_name`, `identity_card_type`, `identity_card_no`, `mobile`, ",
        "`email`, `gender`, `point`, `register_time`, `birthday`, `user_level`, `account_money`, ",
        "`create_time`, `update_time`, `app`",
        "from `user`",
        "where `user_id` = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Update({
        "update `user`",
        "set `user_name` = #{userName,jdbcType=VARCHAR},",
          "`identity_card_type` = #{identityCardType,jdbcType=INTEGER},",
          "`identity_card_no` = #{identityCardNo,jdbcType=VARCHAR},",
          "`mobile` = #{mobile,jdbcType=VARCHAR},",
          "`email` = #{email,jdbcType=VARCHAR},",
          "`gender` = #{gender,jdbcType=CHAR},",
          "`point` = #{point,jdbcType=INTEGER},",
          "`register_time` = #{registerTime,jdbcType=TIMESTAMP},",
          "`birthday` = #{birthday,jdbcType=TIMESTAMP},",
          "`user_level` = #{userLevel,jdbcType=INTEGER},",
          "`account_money` = #{accountMoney,jdbcType=DECIMAL},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP},",
          "`app` = #{app,jdbcType=VARCHAR}",
        "where `user_id` = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}