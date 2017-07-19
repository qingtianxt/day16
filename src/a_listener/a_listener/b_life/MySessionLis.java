package a_listener.a_listener.b_life;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionLis implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session ������......");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("session ������~~");
	}
	
}
