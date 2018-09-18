package me.w4springrain.home.menu.damain;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class ZTree {
	String id;
	String pId;
	String tId;
	String parentTId;
	@NotEmpty
	String name;
	String open;
	String isParent;
	List<ZTree> children;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String getParentTId() {
		return parentTId;
	}
	public void setParentTId(String parentTId) {
		this.parentTId = parentTId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getIsParent() {
		return isParent;
	}
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	public List<ZTree> getChildren() {
		return children;
	}
	public void setChildren(List<ZTree> children) {
		this.children = children;
	}
}
