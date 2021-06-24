package com.cy.cloud.springclouduserservice;

import com.cy.cloud.clients.OrderServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Classname UserController
 * @Auther cy
 * @Date 2020/9/2 21:22
 * @Description TODO
 */
@RestController
@RequestMapping("order")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrderServiceFeignClient orderServiceFeignClient1;

    @GetMapping("/orders/{name}")
    public String orders(@PathVariable("name") String name){
        return orderServiceFeignClient1.orders(name);
    }

//    @GetMapping("/user/{id}")
//    public String user(@PathVariable("id") Integer id){
//        return orderServiceFeignClient1.(id);
//    }

    /**
     * 使用了 @LoadBalanced 注解就不需要 单独注入 LoadBalancerClient 实例了
     * @param restTemplateBuilder
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    /**
     * lb负载均衡调用器
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public String findById(@PathVariable("id") Integer id){

        // 调用订单服务获得订单信息
//        System.out.println("a");
//        ServiceInstance choose = loadBalancerClient.choose("spring-cloud-order-service");

//        String url = String.format("http://%s:%s", choose.getHost(), choose.getPort() + "/order/orders");
//        String url = String.format("http://%s", choose.getServiceId() +  "/order/orders");
//        System.out.println(url);
//        return String.valueOf(choose.getPort());
//        return restTemplate.getForObject(url,String.class);
        return restTemplate.getForObject("http://spring-cloud-order-service/order/orders",String.class);
    }


}