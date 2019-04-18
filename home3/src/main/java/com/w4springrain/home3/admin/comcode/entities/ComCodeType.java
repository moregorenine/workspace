package com.w4springrain.home3.admin.comcode.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class ComCodeType {
	@Id
	@NotEmpty
	@Column(unique = true)
	private String type;
	@NotEmpty
	private String name;
	@OneToMany(mappedBy = "comCodeType", cascade = CascadeType.ALL)
	private List<ComCode> comCodes;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ComCode> getComCodes() {
		return comCodes;
	}
	public void setComCodes(List<ComCode> comCodes) {
		this.comCodes = comCodes;
	}
	
}
