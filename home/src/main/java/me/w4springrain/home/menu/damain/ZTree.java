package me.w4springrain.home.menu.damain;

import java.util.List;

public class ZTree {
	String id;
	String pId;
	String name;
	boolean	open;
	boolean	isParent;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	public List<ZTree> getChildren() {
		return children;
	}
	public void setChildren(List<ZTree> children) {
		this.children = children;
	}
}
