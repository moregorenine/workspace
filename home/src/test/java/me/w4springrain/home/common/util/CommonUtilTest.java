package me.w4springrain.home.common.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CommonUtilTest {

	@Test
	public void generateUUID() {
		String uuid = CommonUtil.generateUUID();
		assertNotNull(uuid);
	}

}
