package org.springframework.aop.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.springframework.aop.service")
@EnableAspectJAutoProxy
public class SpringConfig {
}
