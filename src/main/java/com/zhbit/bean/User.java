package com.zhbit.bean;

/**
 * 管理员
 */
public class User {
	private int uNo;
	private String uName;
	private String uPassword;
	
	public User() {
	}

	public int getuNo() {
		return uNo;
	}

	public void setuNo(int uNo) {
		this.uNo = uNo;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "User{" +
				"uNo=" + uNo +
				", uName='" + uName + '\'' +
				", uPassword='" + uPassword + '\'' +
				'}';
	}
}
