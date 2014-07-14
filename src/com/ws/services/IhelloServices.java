package com.ws.services;

import java.util.List;

import javax.jws.WebService;
import com.ws.model.UserInfo;

@WebService
public interface IhelloServices {
	public String sayHelloToAll(String[] userNames);
	public String[] getHelloWords();
	public String sayHello(String name);
	
	public UserInfo getUserInfo(String userName,int userAge);
	public List<UserInfo> getUserList();
}
