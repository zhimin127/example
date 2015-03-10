package org.test.user.service.impl;

import org.springframework.stereotype.Service;
import org.test.user.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService{

	@Override
	public boolean login(String username, String password) {
		return false;
	}

}
