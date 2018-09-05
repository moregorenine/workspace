package me.w4springrain.home.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.w4springrain.home.common.dao.CommonCodeDao;
import me.w4springrain.home.common.domain.CommonCode;
import me.w4springrain.home.common.service.CommonCodeService;

@Service("commonCodeService")
public class CommonCodeServiceImpl implements CommonCodeService{

//	private static final Logger logger = LoggerFactory.getLogger(CommonCodeServiceImpl.class);
	
	@Resource
	CommonCodeDao commonCodeDao;

	@Override
	public List<CommonCode> selectCommonCodes() {
		return commonCodeDao.selectCommonCodes();
	}
	
}
