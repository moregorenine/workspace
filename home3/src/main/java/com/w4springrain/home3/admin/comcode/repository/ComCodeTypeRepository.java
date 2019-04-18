package com.w4springrain.home3.admin.comcode.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w4springrain.home3.admin.comcode.entity.ComCodeType;

public interface ComCodeTypeRepository extends JpaRepository<ComCodeType, Long> {
	
	Optional<ComCodeType> findByType(String type);
	
}
