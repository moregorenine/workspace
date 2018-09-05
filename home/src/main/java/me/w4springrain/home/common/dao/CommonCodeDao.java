package me.w4springrain.home.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonCodeDao {

	@Autowired
	private SqlSession sqlSession;
	
}
