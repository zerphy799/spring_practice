package com.xzit.homework;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain=true)
public class Consume {
    private int id;
    private String account;
    private LocalDateTime updateTime;
    private String category;
    private int num;
}
