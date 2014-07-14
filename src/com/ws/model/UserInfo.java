package com.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="UserInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"userName","userAge"})
public class UserInfo {
	private String userName;
	private int userAge;
	public UserInfo(String name,int age){
		this.userAge =age;
		this.userName = name;
	}
	public UserInfo(){
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
}
