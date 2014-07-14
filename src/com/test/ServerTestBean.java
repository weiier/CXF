package com.test;

import javax.xml.ws.Endpoint;

import com.ws.services.impl.HelloServicesImpl;

public class ServerTestBean {
	public ServerTestBean(){
		Endpoint.publish("http://localhost:8888/CXF",new HelloServicesImpl() );
	}
	
	 public static void main(String[] args) {  
	        // 启动服务  
	        new ServerTestBean();  
	        System.out.println("Server ready...");     
	        try {  
	            Thread.sleep(1000*300);//休眠五分分钟，便于测试     
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }     
	        System.out.println("Server exit...");     
	        System.exit(0);  
	    }  
}  

