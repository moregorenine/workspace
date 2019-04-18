package com.w4springrain.home3.admin.comcode.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "comCodeType_id", "code" }) })
public class ComCode {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String code;
	@NotEmpty
	private String name;
	@NotEmpty
	private int sort;
	@NotEmpty
	private char useYn;
	@ManyToOne
	@JoinColumn(name = "comCodeType_id")
	private ComCodeType comCodeType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public ComCodeType getComCodeType() {
		return comCodeType;
	}

	public void setComCodeType(ComCodeType comCodeType) {
		this.comCodeType = comCodeType;
	}

}
