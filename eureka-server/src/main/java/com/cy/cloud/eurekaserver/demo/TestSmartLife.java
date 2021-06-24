package com.cy.cloud.eurekaserver.demo;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @Author: CY
 * @Date: 2021/3/28
 * @Description:
 */
@Component
public class TestSmartLife implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("---------------TestSmartLife-----------");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
