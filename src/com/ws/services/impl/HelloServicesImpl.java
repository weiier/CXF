package com.ws.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.ws.model.UserInfo;
import com.ws.services.IhelloServices;
@WebService(endpointInterface="com.ws.services.IhelloServices")
public class HelloServicesImpl implements IhelloServices {

	@Override
	public String sayHelloToAll(String[] userNames) {
		String hello = "hello";
		for(int i = 0; i < userNames.length; i++){
			if(i!=userNames.length-1)
				hello += userNames[i]+" and ";
			else
				hello += userNames[i]+".";
		}
		return hello;
	}

	@Override
	public String[] getHelloWords() {
		String[] words = {"hello","hello, world.","hi,I'm weiier"};
		System.out.println("invoked~~");
		return words;
	}

	@Override
	public String sayHello(String name) {
	
		return "hello"+name+"~";
	}

	@Override
	public UserInfo getUserInfo(String userName, int userAge) {
		return new UserInfo(userName,userAge);
	}
	public List<UserInfo> getUserList(){
		List<UserInfo> list = new ArrayList<UserInfo>();
		UserInfo u1 = new UserInfo();
		u1.setUserAge(11);
		u1.setUserName("test");
		list.add(u1);
		UserInfo u2 = new UserInfo();
		u2.setUserAge(1);
		u2.setUserName("st");
		list.add(u2);
		return list;
	}
}
