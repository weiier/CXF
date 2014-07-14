package com.test;

import javax.xml.ws.Endpoint;

import com.ws.services.impl.HelloServicesImpl;

public class ServerTestBean {
	public ServerTestBean(){
		Endpoint.publish("http://localhost:8888/CXF",new HelloServicesImpl() );
	}
	
	 public static void main(String[] args) {  
	        // ��������  
	        new ServerTestBean();  
	        System.out.println("Server ready...");     
	        try {  
	            Thread.sleep(1000*300);//������ַ��ӣ����ڲ���     
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }     
	        System.out.println("Server exit...");     
	        System.exit(0);  
	    }  
}  

