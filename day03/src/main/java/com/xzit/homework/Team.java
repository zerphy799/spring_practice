package com.xzit.homework;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Data
@Component
public class Team {
    @Value("湖人队")
    private String name;
    @Value("NewYork")
    private String address;
    private List<Team> teams = new ArrayList<>();
}
