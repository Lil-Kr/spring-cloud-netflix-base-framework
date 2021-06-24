package com.cy.cloud.springclouduserservice.feign;

import com.cy.cloud.springclouduserservice.feign.interfaces.OrderServiceFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: CY
 * @Date: 2021/3/26
 * @Description:
 */
@RestController
@RequestMapping("openFeignController")
public class OpenFeignController {

    @Resource
    private OrderServiceFeignClient orderServiceFeignClient1;

    @RequestMapping("getAllOrder")
    public String getAllOrder() {
        String allOrder = orderServiceFeignClient1.getAllOrder();
        return allOrder;
    }
}
