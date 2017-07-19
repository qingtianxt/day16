package doamin;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class Person2 implements HttpSessionActivationListener,Serializable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person2() {
		
	}
	//�
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("person������");
		
	}
	//�ۻ�
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("person����д����̣��ۻ�");
		
	}
	
	
}
