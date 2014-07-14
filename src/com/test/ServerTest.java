package com.test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import com.ws.services.IhelloServices;
import com.ws.services.impl.HelloServicesImpl;

public class ServerTest {
	public ServerTest(){
		IhelloServices hello = new HelloServicesImpl();
		//创建websevices服务接口
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		//注册webservices接口
		factory.setServiceClass(IhelloServices.class);
		// 发布接口
		factory.setAddress("http://localhost:8888/CXF");
		factory.setServiceBean(hello);
		//创建服务
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
