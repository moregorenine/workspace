package com.w4springrain.home3.admin.comcode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w4springrain.home3.admin.comcode.entity.ComCodeType;
import com.w4springrain.home3.admin.comcode.repository.ComCodeTypeRepository;

@Service("comCodeService")
public class ComCodeServiceImpl implements ComCodeService {

	@Autowired
	ComCodeTypeRepository comCodeTypeRepository;
	
	@Override
	public void createComCodeType(ComCodeType comCodeType) {
		comCodeTypeRepository.save(comCodeType);
	}

	@Override
	public Optional<ComCodeType> readComCodeType(Long id) {
		return comCodeTypeRepository.findById(id);
	}
	
	@Override
	public Optional<ComCodeType> readComCodeTypeByType(String type) {
		return comCodeTypeRepository.findByType(type);
	}
	
	@Override
	public List<ComCodeType> readComCodeTypeAll() {
		return comCodeTypeRepository.findAll();
	}

}
