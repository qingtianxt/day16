package a_listener.a_hello_servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyservletContext implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//��������
		System.out.println("servletContextEvent������");
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//���ٲ���
		System.out.println("servletContextEvent������");
		
	}

	
}
