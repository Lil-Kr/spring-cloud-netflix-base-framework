package com.cy.cloud.gatewayserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @Author: CY
 * @Date: 2021/3/30
 * @Description:
 */
@Component

public class CyDefineGatewayFilterFactory extends AbstractGatewayFilterFactory<CyDefineGatewayFilterFactory.CyConfig> {

    Logger logger = LoggerFactory.getLogger(CyDefineGatewayFilterFactory.class);

    private static final String NAME_KEY = "name";

    public CyDefineGatewayFilterFactory() {
        super();
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return null;
    }

    /**
     * 请求拦截
     * @param config
     * @return
     */
    @Override
    public GatewayFilter apply(CyDefineGatewayFilterFactory.CyConfig config) {

        return ((exchange, chain) -> {
            logger.info("[pre] Filter Request, name:{}",config.getName());

            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("[post]: Response Filter");
            }));
        });
    }


    public static class CyConfig {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
