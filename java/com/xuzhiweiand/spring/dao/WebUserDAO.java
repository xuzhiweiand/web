package com.xuzhiweiand.spring.dao;

import java.util.List;

import com.xuzhiweiand.spring.domain.WebUser;

public interface WebUserDAO {
	public List<WebUser> getWebUserByUserName(WebUser webUser);
}
