package com.shiro.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.shiro.*"},exclude = DataSourceAutoConfiguration.class)
@MapperScan({"com.shiro.dao"})
public class SpringbootShiroWebApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringbootShiroWebApplication.class);
		//application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
