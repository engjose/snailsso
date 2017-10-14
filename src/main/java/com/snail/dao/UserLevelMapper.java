package com.snail.dao;

import com.snail.pojo.domain.UserLevel;
import com.snail.pojo.domain.UserLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int countByExample(UserLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int deleteByExample(UserLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `user_level`",
        "where `level_id` = #{levelId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `user_level` (`level_id`, `level_name`, ",
        "`min_point`, `max_point`, ",
        "`create_time`, `update_time`)",
        "values (#{levelId,jdbcType=INTEGER}, #{levelName,jdbcType=VARCHAR}, ",
        "#{minPoint,jdbcType=INTEGER}, #{maxPoint,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(UserLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int insertSelective(UserLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    List<UserLevel> selectByExample(UserLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`level_id`, `level_name`, `min_point`, `max_point`, `create_time`, `update_time`",
        "from `user_level`",
        "where `level_id` = #{levelId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserLevel selectByPrimaryKey(Integer levelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserLevel record, @Param("example") UserLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserLevel record, @Param("example") UserLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_level
     *
     * @mbggenerated
     */
    @Update({
        "update `user_level`",
        "set `level_name` = #{levelName,jdbcType=VARCHAR},",
          "`min_point` = #{minPoint,jdbcType=INTEGER},",
          "`max_point` = #{maxPoint,jdbcType=INTEGER},",
          "`create_time` = #{createTime,jdbcType=TIMESTAMP},",
          "`update_time` = #{updateTime,jdbcType=TIMESTAMP}",
        "where `level_id` = #{levelId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserLevel record);
}