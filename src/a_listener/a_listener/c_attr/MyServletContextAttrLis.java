package a_listener.a_listener.c_attr;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttrLis implements ServletContextAttributeListener {
//���
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("��servlet�������һ������,����Ϊ��"+scae.getName());
	}
//�Ƴ�
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		
		System.out.println("��servlet���Ƴ���һ������,����Ϊ��"+scae.getName());
	}
//�滻
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		
		System.out.println("��servlet���滻��һ������,����Ϊ��"+scae.getName());
	}
	
}
