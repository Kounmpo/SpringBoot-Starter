package com.hui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huang jiehui
 * @date 2021/1/20 23:12
 */
@SuppressWarnings("all")
@Configuration
@ConditionalOnWebApplication //web应用生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {
	@Autowired
	HelloProperties helloProperties;

	@Bean
	public HelloService helloService(){
		HelloService service = new HelloService();
		service.setHelloProperties(helloProperties);
		return service;
	}
}
