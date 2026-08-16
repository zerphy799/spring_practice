package com.xzit.homewwork2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class Student1 {
    private String name;
    private String libraryCard;
    private List<Student1> students;
}
