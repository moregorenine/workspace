package me.w4springrain.home.common.domain;

import java.util.Date;

public class CommonSequenceVO {
	String seqNm;
	Integer seqCurrval; 
	String regUser;
	Date regDt;
	String uptUser;
	Date uptDt;
	
	public String getSeqNm() {
		return seqNm;
	}
	public void setSeqNm(String seqNm) {
		this.seqNm = seqNm;
	}
	public Integer getSeqCurrval() {
		return seqCurrval;
	}
	public void setSeqCurrval(Integer seqCurrval) {
		this.seqCurrval = seqCurrval;
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
