package com.xzit.service;

import com.xzit.homework.Consume;
import com.xzit.homework.Count;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Service {
    void addCount(Count count);
    void batchInsert( List<Count> list);
    List<Count> selectAll();
    void login( Count count);
    void update(Count count);
    Count selectOne(String account);
}
