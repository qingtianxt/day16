package a_listener.a_listener.b_life;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyRequestLis implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("����������");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("��������");

	}
	
}
