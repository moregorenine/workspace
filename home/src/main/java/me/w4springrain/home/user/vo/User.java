package me.w4springrain.home.user.vo;

import org.joda.time.DateTime;

public class User {
	String userId;
    String system;
    String email;
    String passwork;
    DateTime regDt;
    DateTime uptDt;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswork() {
		return passwork;
	}
	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}
	public DateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(DateTime regDt) {
		this.regDt = regDt;
	}
	public DateTime getUptDt() {
		return uptDt;
	}
	public void setUptDt(DateTime uptDt) {
		this.uptDt = uptDt;
	}

}
