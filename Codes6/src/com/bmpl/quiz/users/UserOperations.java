package com.bmpl.quiz.users;

import java.util.Scanner;

import com.bmpl.quiz.common.Message;

/**
 * This is UserOperations Class and it contain the logic 
 * related to login of the user
 * @author amit
 *
 */
public class UserOperations {
	
	private User[] prepareUsers(){
		User users[] = new User[5];
		for(int i = 0; i<users.length ; i++){
		User user = new User();
		user.setUserid("amit"+i);
		user.setPassword("1234"+i);
		users[i]= user;
		}
		return users;
		
	}
	
	public Message isLogin(){
		//int p [] = new int[5];
		
		//String arr[] = {"amit","ram"};
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		User users[] = this.prepareUsers();
		Message message = new Message();
		for(User user: users){
			if(user.getUserid().equals(userid) && 
					user.getPassword().equals(password)){
				//return true;
				message.setStatus(true);
				message.setMessage("Welcome ");
				message.setUser(userid);
				return message;
			}
			
		}
		message.setStatus(false);
		message.setMessage("Invalid Userid or Password ");
		return message;
		//return false;
	}

}
