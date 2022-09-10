package com.trillionstar.trackAny;

import com.trillionstar.trackAny.model.RibbonEurekaClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RibbonClients(defaultConfiguration = RibbonEurekaClientConfig.class)
public class TrackAnyApplication {

	public static void main(String[] args) {

		SpringApplication.run(TrackAnyApplication.class, args);

	}

}
