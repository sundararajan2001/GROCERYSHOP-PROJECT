package com.example.springbootsecurity.data;

public class UserDTO {
	private String loginUsername;
	private String loginPassword;
	private String loginRole;

	public String getloginRole() {
		return loginRole;
	}

	public void setRole(String loginRole) {
		this.loginRole = loginRole;
	}

	public String getloginUsername() {
		return loginUsername;
	}

	public void setUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getloginPassword() {
		return loginPassword;
	}

	public void setPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
