package com.xzit.homework2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Go {
    @Value("beiJing")
    private String destination;
    @Value("chengDu")
    private String startPlace;
    public void go(){
        System.out.println("准备从"+startPlace+"飞往"+destination);
    }
}
