package com.test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import com.ws.services.IhelloServices;
import com.ws.services.impl.HelloServicesImpl;

public class ServerTest {
	public ServerTest(){
		IhelloServices hello = new HelloServicesImpl();
		//����websevices����ӿ�
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		//ע��webservices�ӿ�
		factory.setServiceClass(IhelloServices.class);
		// �����ӿ�
		factory.setAddress("http://localhost:8888/CXF");
		factory.setServiceBean(hello);
		//��������
		factory.create();
	}
	public static void main(String[] args){
		new ServerTest();
		System.out.println("Server ready...");
		try {
			Thread.sleep(1000*300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Server exit...");
		System.exit(0);
	}
}
