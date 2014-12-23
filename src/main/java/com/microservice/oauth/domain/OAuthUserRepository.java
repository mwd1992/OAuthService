package com.microservice.oauth.domain;

import org.springframework.data.repository.Repository;

public interface OAuthUserRepository
		extends Repository<OAuthUser, Long>
{
	public void save(OAuthUser user);

	public OAuthUser getByUsername(String username);
}
