package me.w4springrain.home.common.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.w4springrain.home.common.dao.CommonSequenceDao;
import me.w4springrain.home.common.domain.CommonSequenceVO;
import me.w4springrain.home.common.service.CommonSequenceService;

@Service("commonSequenceService")
public class CommonSequenceServiceImpl implements CommonSequenceService {

//	private static final Logger logger = LoggerFactory.getLogger(CommonCodeServiceImpl.class);
	
	@Resource
	CommonSequenceDao commonSequenceDao;

	@Override
	public void restartSeq(CommonSequenceVO commonSequence) {
		commonSequenceDao.restartSeq(commonSequence);
	}

	@Override
	public int selectCurrvalSeq(CommonSequenceVO commonSequenceVO) {
		return commonSequenceDao.selectCurrvalSeq(commonSequenceVO);
	}
	
	@Override
	@Transactional
	public int selectNextvalSeq(CommonSequenceVO commonSequenceVO) {
		commonSequenceDao.increaseSeq(commonSequenceVO);
		return this.selectCurrvalSeq(commonSequenceVO);
	}

}
