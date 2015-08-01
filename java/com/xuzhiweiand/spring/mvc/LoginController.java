package com.xuzhiweiand.spring.mvc;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xuzhiweiand.spring.domain.WebUser;
import com.xuzhiweiand.spring.service.WebUserService;
import com.xuzhiweiand.spring.utils.ConstantUtil;

@Controller
public class LoginController {

	@Inject
	private WebUserService userService;

	@RequestMapping(value = "login")
	public String goLogin() {
		return ConstantUtil.TO_LOGIN;
	}

	@RequestMapping(value = "validate")
	public String validateLogin(WebUser user, HttpSession session) {
		Boolean result = userService.validatorUser(user);
		if (result) {
			session.setAttribute("username", user.getUsername());
			return "redirect:/";
		}
		return ConstantUtil.TO_LOGIN;
	}

	@RequestMapping(value = "logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:/";
	}
}
