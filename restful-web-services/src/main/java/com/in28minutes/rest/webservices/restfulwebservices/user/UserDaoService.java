package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users=new ArrayList<>();
	private static int  userCount=3;
	
	static {
		
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Jack",new Date()));
		users.add(new User(3,"Sarika",new Date()));
		users.add(new User(4,"Draco",new Date()));
	}
	
	//methods need to be created are 
	//1.List<user> findAll()
	
		public List<User> findAll(){
			return users;
		}
	
	//save(user User)
		
		public User save(User user) {
			if(user.getId()==null) {
				user.setId(++userCount);
			}
			users.add(user);
			return user;
					
		}
	//public User FindOne(int id)
	
		public User findOne(int id) {
			
			for(User user:users) {
				if(user.getId()==id) {
					return user;
				}
			}
			return null;
		}
}
