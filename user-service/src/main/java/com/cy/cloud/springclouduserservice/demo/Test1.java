package com.cy.cloud.springclouduserservice.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: CY
 * @Date: 2021/3/25
 * @Description:
 */
@Data
@NoArgsConstructor
public class Test1 {

    private String name;

    private Integer age;

    public Test1(String name) {
        this.name = name;
    }

    public Test1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
