package com.cy.cloud.springclouduserservice.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: CY
 * @Date: 2021/3/26
 * @Description:
 */
@FeignClient(value = "spring-cloud-order-service")
public interface OrderServiceFeignClient {

  @GetMapping("/order/orders")
  String getAllOrder();

}
