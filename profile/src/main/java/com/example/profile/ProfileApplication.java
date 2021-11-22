package com.example.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.seata.config.springcloud.EnableSeataSpringConfig;

@SpringBootApplication
@EnableFeignClients
@EnableSeataSpringConfig
@EnableConfigurationProperties
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

}
