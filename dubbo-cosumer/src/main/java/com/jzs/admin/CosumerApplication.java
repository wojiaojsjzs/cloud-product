package com.jzs.admin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubboConfig
//@EnableDubboConfiguration
@NacosPropertySource(dataId = "example", groupId = "DEFAULT_GROUP", autoRefreshed = true)
//@EnableDubbo(scanBasePackages = "com.jzs.admin.service")
public class CosumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosumerApplication.class, args);
    }
   /* @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-consumer");
        return applicationConfig;
    }*/
}
