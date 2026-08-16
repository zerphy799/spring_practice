package com.xzit.homework;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ma {
    @Value("${bean.aDouble}")
    private double aDouble;

    @Override
    public String toString() {
        return "Ma{" +
                "aDouble=" + aDouble +
                '}';
    }
}
