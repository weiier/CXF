package com.ws.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Users {
	private ArrayList<UserInfo> userList;
	private HashMap<Integer,UserInfo> userMap;
	private UserInfo[] userArray;
	public ArrayList<UserInfo> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<UserInfo> userList) {
		this.userList = userList;
	}
	public HashMap<Integer, UserInfo> getUserMap() {
		return userMap;
	}
	public void setUserMap(HashMap<Integer, UserInfo> userMap) {
		this.userMap = userMap;
	}
	public UserInfo[] getUserArray() {
		return userArray;
	}
	public void setUserArray(UserInfo[] userArray) {
		this.userArray = userArray;
	}
	
}
