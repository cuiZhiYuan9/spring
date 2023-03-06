package org.springframework;

import org.springframework.aop.service.DoubleTargetClass;
import org.springframework.aop.service.LogUtil;
import org.springframework.aop.service.MyCalculator;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.util.Properties;

public class Hello {
	public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
		saveGeneratedCgGlibProxyFiles(System.getProperty("user.dir")+"/proxy");
		ApplicationContext a = new ClassPathXmlApplicationContext("application.xml");
		MyCalculator bean = a.getBean(MyCalculator.class);
		a.getBean(LogUtil.class);
		bean.add(1,2);

	}

	private static void saveGeneratedCgGlibProxyFiles(String s) throws NoSuchFieldException, IllegalAccessException {
		Field field = System.class.getDeclaredField("props");
		field.setAccessible(true);
		Properties props = (Properties) field.get(null);
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,s);
		props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
	}
}

