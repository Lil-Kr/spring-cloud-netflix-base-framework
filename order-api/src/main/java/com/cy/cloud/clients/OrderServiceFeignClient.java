package com.cy.cloud.clients;

import com.cy.cloud.interfaces.OrderService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author: CY
 * @Date: 2021/3/26
 * @Description:
 */
@FeignClient("order-service")
@Component
public interface OrderServiceFeignClient extends OrderService {

}
