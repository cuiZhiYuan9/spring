package org.springframework.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*@Aspect
@Component*/
public class DoubleAop {

	@Pointcut("execution(* org.springframework.aop.service.DoubleTargetClass(..))")
	public void doubles(){

	}

	@Before(value = "doubles()")
	public void before(JoinPoint joinPoint){
		System.out.println(Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(value = "doubles()", returning = "result")
	public static void stop(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法执行结束，结果是：" + result);
	}

	@AfterThrowing(value = "doubles()", throwing = "e")
	public static void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法抛出异常：" + e.getMessage());
	}

	@After("doubles()")
	public static void logFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log---" + signature.getName() + "方法执行结束。。。。。over");

	}

	@Around("doubles()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Signature signature = pjp.getSignature();
		Object[] args = pjp.getArgs();
		Object result = null;
		try {
			//通过反射的方式调用目标的方法，相当于执行method.invoke(),可以自己修改结果值
			result = pjp.proceed(args);
			System.out.println("log---环绕通知stop" + signature.getName() + "方法执行结束");
		} catch (Throwable throwable) {
			System.out.println("log---环绕异常通知：" + signature.getName() + "出现异常");
			throw throwable;
		} finally {
			System.out.println("log---环绕返回通知：" + signature.getName() + "方法返回结果是：" + result);
		}
		return result;
	}
}
