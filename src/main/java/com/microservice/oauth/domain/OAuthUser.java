package com.microservice.oauth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OAuthUser
{
	@GeneratedValue
	@Id
	private Long id;

	private String username;
	private String password;

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}
}
