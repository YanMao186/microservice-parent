package com.ym.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Ribbon的配置类，
 * 注意该类不应该出现在应用程序上下文的@ComponentScan所扫描的包中。
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
//        将负载均衡规则改为随机
        return new RandomRule();
    }
}
