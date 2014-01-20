package fr.bomberman.server;

import java.util.HashMap;

public class User {
	private static HashMap<String, User> _listUser = new HashMap<String, User>();
	private String _username;
	
	private User(String name) throws Exception {
		_username = name;
		_listUser.put(name, this);
	}
	
	public String getUserName() {
		return _username;
	}
	
	public void setUserName(String name) {
		_username = name;
	}
	
	public static HashMap<String, User> getList() {
		return _listUser;
	}

	public static User createUser(String username) throws Exception {
		if(_listUser.containsKey(username)) {
			throw new Exception("User Already Exists");
		} else {
			return new User(username);
		}
	}
}
