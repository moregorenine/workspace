package com.w4springrain.home3.admin.comcode.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.w4springrain.home3.admin.comcode.entity.ComCodeType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComCodeServiceTest {

	@Autowired ComCodeService comCodeService;
	@Test
	public void test() {
		ComCodeType comCodeType = new ComCodeType();
		comCodeType.setType("POSITION");
		comCodeType.setName("employee's position");
		comCodeService.createComCodeType(comCodeType);
		
		Optional<ComCodeType> dbComCodeType = comCodeService.readComCodeTypeByType("POSITION");
		
		assertNotNull(dbComCodeType);
		assertEquals("POSITION", dbComCodeType.get().getType());
	}

}
