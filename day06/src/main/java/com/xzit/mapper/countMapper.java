package com.xzit.mapper;

import com.xzit.homework.Count;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface countMapper {
   @Insert("insert into `count` values (null,#{account},#{password},#{coupon})")
    void addCount(Count count);
   @Insert("<script>" +
           "insert into `count`(account,password,coupon) values " +
           "<foreach collection='list' item='item' separator=','>" +
           "(#{item.account},#{item.password},#{item.coupon})" +
           "</foreach>" +
           "</script>")
    void batchInsert(@Param("list") List<Count> list);

    @Select("select * from `count`")
    List<Count> selectAll();

    @Select("select `count`.password from `count` where account=#{account}")
    String login(@Param("account") String account);

    @Update("update `count` set coupon = coupon-#{coupon} where account = #{account}")
    void update(Count count);

    @Select("select * from count where account = #{account}")
    Count selectByAccount(String account);
}
