package com.w4springrain.home3.admin.comcode.service;

import java.util.List;
import java.util.Optional;

import com.w4springrain.home3.admin.comcode.entity.ComCodeType;

public interface ComCodeService {

	void createComCodeType(ComCodeType comCodeType);

	Optional<ComCodeType> readComCodeType(Long id);

	Optional<ComCodeType> readComCodeTypeByType(String type);

	List<ComCodeType> readComCodeTypeAll();

}
