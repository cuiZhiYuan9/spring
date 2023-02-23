package org.springframework.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.serivce.IOCService;
import org.springframework.serivce.impl.IOCServiceImpl;

@EnableAspectJAutoProxy
@Configuration
public class ConfigTest {

	@Bean
	public IOCService iocService(){
		return new IOCServiceImpl();
	}


}
