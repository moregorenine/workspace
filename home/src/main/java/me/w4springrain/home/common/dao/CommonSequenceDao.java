package me.w4springrain.home.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.w4springrain.home.common.domain.CommonSequenceVO;

@Repository
public class CommonSequenceDao {

	@Autowired
	private SqlSession sqlSession;

	public void restartSeq(CommonSequenceVO commonSequenceVO) {
		sqlSession.update("seq.restartSeq", commonSequenceVO);
	}

	public void increaseSeq(CommonSequenceVO commonSequenceVO) {
		sqlSession.update("seq.increaseSeq", commonSequenceVO);
	}

	public int selectCurrvalSeq(CommonSequenceVO commonSequenceVO) {
		return sqlSession.selectOne("seq.selectCurrvalSeq", commonSequenceVO);
	}
}
