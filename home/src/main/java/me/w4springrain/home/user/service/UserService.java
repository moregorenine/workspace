package me.w4springrain.home.user.service;

import java.util.List;

import me.w4springrain.home.user.vo.User;

public interface UserService {

	/**
	 * user 생성한다.
	 */
	void createUser(User user);

	/**
	 * users 조회한다.
	 * @return 
	 */
	List<User> selectUsers();

}
