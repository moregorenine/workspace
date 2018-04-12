package me.w4springrain.home.user.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import me.w4springrain.home.common.util.CommonUtil;
import me.w4springrain.home.user.dao.UserDao;
import me.w4springrain.home.user.domain.User;
import me.w4springrain.home.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource
	UserDao userDao;
	
	@Override
	public void createUser(User user) {
		logger.debug("userId 생성");
		String userId = CommonUtil.generateUUID();
		Date now = new Date();
		
		user.setUserId(userId);
		user.setRegDt(now);
		user.setUptDt(now);
		
		userDao.createUser(user);
	}
	
	@Override
	public List<User> selectUsers() {
		return userDao.selectUsers();
	}

}
