package com.xzit.service;

import com.xzit.homework.Consume;
import com.xzit.homework.Count;
import com.xzit.mapper.countMapper;
import jakarta.annotation.Resource;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Resource
    private countMapper countMapper;
    @Override
    public void addCount(Count count) {
        countMapper.addCount(count);
    }

    @Override
    public void batchInsert(List<Count> list) {
           countMapper.batchInsert(list);
    }

    @Override
    public List<Count> selectAll() {
       return countMapper.selectAll();
    }

    @Override
    public void login(Count count) {
      if(count.getPassword().equals(findPassword(count))){
          System.out.println("登陆成功");
      }else{
          System.out.println("登录失败");
      }
    }

    @Override
    public void update(Count count) {
         countMapper.update(count);
    }

    @Override
    public Count selectOne(String account) {
        return countMapper.selectByAccount(account);
    }

    public String findPassword(Count count) {
        return countMapper.login(count.getAccount());
    }

}
