package com.xuzhiweiand.spring.mvc;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.object.PageInfo;
import com.xuzhiweiand.spring.service.WebBlogService;
import com.xuzhiweiand.spring.utils.ConstantUtil;

@Controller
public class IndexController {

	@Inject
	private WebBlogService blogService;

	@RequestMapping(value = "/")
	public String goIndex(@RequestParam(required = false) Integer start, Model model) {
		
		PageInfo<WebBlog> pageInfo = blogService.getWebBlogsForIndex(start, ConstantUtil.PAGE_SIZE);

		model.addAttribute("pageInfo", pageInfo);

		return ConstantUtil.INDEX;
	}
}
