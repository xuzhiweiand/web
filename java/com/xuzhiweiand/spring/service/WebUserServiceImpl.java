package com.xuzhiweiand.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.xuzhiweiand.spring.dao.WebUserDAO;
import com.xuzhiweiand.spring.domain.WebUser;

@Service
public class WebUserServiceImpl implements WebUserService {

	@Inject
	private WebUserDAO dao;

	@Override
	public Boolean validatorUser(WebUser webUser) {
		Assert.notNull(webUser, "用户不存在");
		Assert.hasText(webUser.getUsername(), "请输入用户名");
		Assert.hasText(webUser.getPassword(), "请输入密码");
		List<WebUser> webUsers = dao.getWebUserByUserName(webUser);
		if (CollectionUtils.isEmpty(webUsers)) {
			return false;
		}
		return true;
	}

}
