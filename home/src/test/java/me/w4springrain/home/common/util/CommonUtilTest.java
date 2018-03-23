package me.w4springrain.home.common.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtilTest {

	private static final Logger logger = LoggerFactory.getLogger(CommonUtilTest.class);
	
	@Test
	public void test() {
		String uuid = CommonUtil.generateUUID();
		assertNotNull(uuid);
	}

}
