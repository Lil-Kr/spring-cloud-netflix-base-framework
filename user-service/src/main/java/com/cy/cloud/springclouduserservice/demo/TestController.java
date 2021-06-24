package com.cy.cloud.springclouduserservice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Author: CY
 * @Date: 2021/3/25
 * @Description:
 */
@RestController
@RequestMapping("testController")
public class TestController {

    @Autowired
    @Qualifier
    List<Test> testList = Collections.emptyList();

    @Autowired
    @Qualifier
    List<Test1> test1List = Collections.emptyList();

    @GetMapping("test")
    public Object test() {
        System.out.println(testList);
        System.out.println(test1List);
        return testList;
    }

}