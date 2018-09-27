package me.w4springrain.home.common.service;

import me.w4springrain.home.common.domain.CommonSequenceVO;

public interface CommonSequenceService {

	/**
	 * W4_SEQUENCES 시퀀스 초기화
	 */
	void restartSeq(CommonSequenceVO commonSequence);

	/**
	 * W4_SEQUENCES 시퀀스 조회
	 * @param commonSequenceVO
	 * @return
	 */
	int selectCurrvalSeq(CommonSequenceVO commonSequenceVO);

	/**
	 * W4_SEQUENCES ++시퀀스 조회
	 */
	int selectNextvalSeq(CommonSequenceVO commonSequenceVO);
}
