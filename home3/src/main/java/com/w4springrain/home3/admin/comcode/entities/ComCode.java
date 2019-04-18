package com.w4springrain.home3.admin.comcode.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class ComCode {
	@Id
	@NotEmpty
	@Column(unique = false)
	private String code;
	@NotEmpty
	private String name;
	@NotEmpty
	private int sort;
	@NotEmpty
	private char useYn;
	@ManyToOne
	@JoinColumn(name = "COMCODETYPE_ID")
	private ComCodeType codeType;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public char getUseYn() {
		return useYn;
	}
	public void setUseYn(char useYn) {
		this.useYn = useYn;
	}
	public ComCodeType getCodeType() {
		return codeType;
	}
	public void setCodeType(ComCodeType codeType) {
		this.codeType = codeType;
	}
	
}
