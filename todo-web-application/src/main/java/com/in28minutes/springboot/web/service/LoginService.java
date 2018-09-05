package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		
		
		return (userid.equalsIgnoreCase("in28minutes")
				&& password.equalsIgnoreCase("dummy"))
			  || (userid.equalsIgnoreCase("adam")
						&& password.equalsIgnoreCase("adam@123"))
			  || (userid.equalsIgnoreCase("eve")
						&& password.equalsIgnoreCase("eve@123"))
				;
	}

}