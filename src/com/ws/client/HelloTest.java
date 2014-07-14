package com.ws.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ws.services.IhelloServices;

public class HelloTest {
	public static void main(String[] args){
		//����webservice�ͻ��˴�����
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//ע��webservice�ӿ�
		factory.setServiceClass(IhelloServices.class);
		//����webservice��ַ
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
