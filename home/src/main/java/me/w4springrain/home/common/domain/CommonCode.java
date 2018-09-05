package me.w4springrain.home.common.domain;

import java.util.Date;

public class CommonCode {
	String codeId;
	String codeCode;
	String codeDesc;
    String codeKor;
    String codeEn;
    String codeCh;
    String parent;
    int seq;
	String regUser;
	Date regDt;
	String uptUser;
	Date uptDt;
	
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getCodeCode() {
		return codeCode;
	}
	public void setCodeCode(String codeCode) {
		this.codeCode = codeCode;
	}
	public String getCodeDesc() {
		return codeDesc;
	}
	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}
	public String getCodeKor() {
		return codeKor;
	}
	public void setCodeKor(String codeKor) {
		this.codeKor = codeKor;
	}
	public String getCodeEn() {
		return codeEn;
	}
	public void setCodeEn(String codeEn) {
		this.codeEn = codeEn;
	}
	public String getCodeCh() {
		return codeCh;
	}
	public void setCodeCh(String codeCh) {
		this.codeCh = codeCh;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public String getUptUser() {
		return uptUser;
	}
	public void setUptUser(String uptUser) {
		this.uptUser = uptUser;
	}
	public Date getUptDt() {
		return uptDt;
	}
	public void setUptDt(Date uptDt) {
		this.uptDt = uptDt;
	}
}
