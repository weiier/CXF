package com.ws.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ws.services.IhelloServices;

public class HelloTest {
	public static void main(String[] args){
		//创建webservice客户端代理工厂
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//注册webservice接口
		factory.setServiceClass(IhelloServices.class);
		//设置webservice地址
		factory.setAddress("http://localhost:8888/CXF");
		IhelloServices ihello = (IhelloServices) factory.create();
		System.out.println("invoke webservice...");
		String[] hellos = ihello.getHelloWords();
		for(int i=0; i<hellos.length;i++){
			System.out.println(hellos[i]);
		}
		System.out.println(ihello.sayHello("world~"));
		System.exit(0);
	}
}
