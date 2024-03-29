package com.study.SpringBoot.untils;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//这个注解导入刚才增加的jdbc配置文件
@PropertySource("classpath:prop.properties")
public class DataSourceConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.maxActive}")
	private int maxActive;
	@Value("${jdbc.maxIdel}")
	private int maxIdel;
	@Value("${jdbc.maxWait}")
	private long maxWait;
}
