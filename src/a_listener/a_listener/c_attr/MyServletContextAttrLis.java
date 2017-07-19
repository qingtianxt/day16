package a_listener.a_listener.c_attr;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttrLis implements ServletContextAttributeListener {
//添加
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("在servlet中添加了一个属性,属性为："+scae.getName());
	}
//移除
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		
		System.out.println("在servlet中移除了一个属性,属性为："+scae.getName());
	}
//替换
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		
		System.out.println("在servlet中替换了一个属性,属性为："+scae.getName());
	}
	
}
