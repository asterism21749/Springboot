package com.dhee.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = ("com.dhee"))
@ComponentScan(basePackages = "com.dhee")
@SpringBootApplication
public class MybatisDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		// 原始写法，开启佛祖护体
		SpringApplication.run(MybatisDemoApplication.class, args);

		// 关闭banner.txt
		// SpringApplication springApplication= new
		// SpringApplication(MybatisDemoApplication.class);
		// springApplication.setBannerMode(Banner.Mode.OFF);
		// springApplication.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MybatisDemoApplication.class);
	}

}
