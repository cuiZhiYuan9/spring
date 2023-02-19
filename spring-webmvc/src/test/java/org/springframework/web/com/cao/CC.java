package org.springframework.web.com.cao;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import java.io.File;

@RestController
public class CC {

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();//创建tomcat对象
		tomcat.setPort(8088); //设置端口
		tomcat.getConnector();
		//创建web容器上下文
		Context context = tomcat.addContext("", null);


		DispatcherServlet dispatcherServlet = new DispatcherServlet(
				createApplicationContext(context.getServletContext()));
		Wrapper servlet = Tomcat.addServlet(context, "dispatcherServlet", dispatcherServlet);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/*");
		tomcat.start();
	}
	public static WebApplicationContext createApplicationContext(
			ServletContext servletContext) {
		AnnotationConfigWebApplicationContext ctx
				= new AnnotationConfigWebApplicationContext();
		//ctx.register(WebApplicationConfig.class); //加载配置类
		ctx.setServletContext(servletContext);
		ctx.refresh();
		ctx.registerShutdownHook();
		return ctx;
	}

}
