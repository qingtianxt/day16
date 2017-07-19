package doamin;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Person implements HttpSessionBindingListener{
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
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		
	}
	//�󶨵�session
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("person����󶨵���session��");
	}
	//��session���Ƴ�
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("person�����session���Ƴ���");
		
	}
	
}
