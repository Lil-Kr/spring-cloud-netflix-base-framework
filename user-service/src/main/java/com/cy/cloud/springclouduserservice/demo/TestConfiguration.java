package com.cy.cloud.springclouduserservice.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: CY
 * @Date: 2021/3/25
 * @Description:
 */
@Configuration
public class TestConfiguration {

    @Bean("tes1t")
    @Qualifier
    Test tes1t() {
        return new Test("abc",12);
    }

    @Bean("test2")
    @Qualifier
    Test test2() {
        return new Test("test2",14);
    }

    @Bean("test3")
    @Qualifier
    Test1 test3() {
        return new Test1("test2",14);
    }
}