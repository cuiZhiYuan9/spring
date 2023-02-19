package org.springframework.web.com.cao;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

@RestController
public class CC {

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	public static void main(String[] args) {
		Tomcat tomcat = new Tomcat();
		Connector conn = new Connector();
		conn.setPort(80);
		tomcat.setConnector(conn);


		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext.register(CC.class);
		annotationConfigWebApplicationContext.refresh();
		dispatcherServlet.setApplicationContext(annotationConfigWebApplicationContext);
		Context ctx = tomcat.addContext("", new File(".").getAbsolutePath());
		ctx.addApplicationListener("org.springframework.web.context.ContextLoaderListener");
		Tomcat.addServlet(ctx, "mvc", dispatcherServlet).addMapping("/*");
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}

}
