package me.w4springrain.home.common.domain;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class CommonVO {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonVO.class);
	
	/**
	 * selected menuId
	 */
	String stMenuId;
	/**
	 * @Valid 검증 결과값
	 */
	List<ObjectError> errors = new ArrayList<ObjectError>();

	public String getStMenuId() {
		return stMenuId;
	}
	public void setStMenuId(String stMenuId) {
		this.stMenuId = stMenuId;
	}
	public List<ObjectError> getErrors() {
		return errors;
	}
	public void setErrors(List<ObjectError> errors) {
		this.errors = errors;
	}
	
	/**
	 * @param bindingResult
	 * Valid 검증 결과 setting
	 */
	public void checkErrors(BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			logger.debug("Binding Result has error!");
			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				logger.debug("error : {}", error.getDefaultMessage());
			}
			this.setErrors(errors);
		}
	}
}
