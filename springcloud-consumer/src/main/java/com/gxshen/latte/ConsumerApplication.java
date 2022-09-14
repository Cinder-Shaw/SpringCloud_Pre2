package com.gxshen.latte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.gxshen.latte.feign"})
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)
public class ConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
