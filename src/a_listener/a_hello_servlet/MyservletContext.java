package a_listener.a_hello_servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyservletContext implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//创建操作
		System.out.println("servletContextEvent创建了");
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//销毁操作
		System.out.println("servletContextEvent销毁了");
		
	}

	
}
