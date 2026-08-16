package com.xzit.service;

import com.xzit.homework.Consume;
import com.xzit.homework.Count;
import com.xzit.mapper.consumeMapper;
import com.xzit.mapper.countMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


@Service("use")
public class AccServiceImpl implements AccService {
    @Resource
    private consumeMapper consumeMapper;
    @Resource
    private countMapper countMapper;
    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.REPEATABLE_READ,
            timeout = 5
    )
    @Override
    public void pay(String account, int num) {
        Consume consume = new Consume();
        consume.setAccount(account).setNum(num).setCategory("充值");
        consumeMapper.insert(consume);
        System.out.println("执行交易记录");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
        Count count = new Count();
        count.setAccount(account).setCoupon(num);
        countMapper.update(count);
        System.out.println("执行用户信息修改处理");
    }
}
