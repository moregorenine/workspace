package me.w4springrain.home.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.w4springrain.home.user.domain.User;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void createUser(User user) {
		sqlSession.insert("users.createUser", user);
	}

	public List<User> selectUsers() {
		List<User> users = sqlSession.selectList("users.selectUsers");
		return users;
	}

	
}
