package com.xzit.mapper;

import com.xzit.homework.Consume;
import org.apache.ibatis.annotations.Insert;

public interface consumeMapper {
    @Insert("insert into consume values (null,#{account},#{updateTime},#{category},#{num})")
    void insert(Consume consume);
}
