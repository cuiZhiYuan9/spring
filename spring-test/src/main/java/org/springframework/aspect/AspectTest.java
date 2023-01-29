package org.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {
	@Pointcut("execution(public * org.springframework.serivce.impl.IOCServiceImpl.hello())")
	public void testAOP(){}

	@Before("testAOP()")
	public void before(){
		System.out.println("before testAOP...");
	}

	@After("testAOP()")
	public void after(){
		System.out.println("after testAOP...");
	}

	@Around("testAOP()")
	public Object around(ProceedingJoinPoint p){
		System.out.println("around before testAOP...");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around after testAOP...");
		return o;
	}

}
