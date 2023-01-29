package org.springframework.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.serivce.IOCService;

public class AspectHello {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springframework.config","org.springframework.aspect");
		IOCService bean = applicationContext.getBean(IOCService.class);
		System.out.println(bean.hello());
	}
}
