package me.w4springrain.home.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.w4springrain.home.common.domain.CommonCode;

@Repository
public class CommonCodeDao {

	@Autowired
	private SqlSession sqlSession;

	public List<CommonCode> selectCommonCodes() {
		return sqlSession.selectList("common.selectCommonCodes");
	}
	
}
