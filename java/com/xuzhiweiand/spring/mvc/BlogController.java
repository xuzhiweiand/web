package com.xuzhiweiand.spring.mvc;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.service.WebBlogService;
import com.xuzhiweiand.spring.utils.ConstantUtil;

@Controller
public class BlogController {

	@Inject
	private WebBlogService blogService;

	@RequestMapping(value = "writeBlog")
	public String toBlog() {
		return ConstantUtil.TO_WRITE_BLOG;
	}

	@RequestMapping(value = "pubBlog")
	public String addBlog(WebBlog webBlog, HttpSession session) {
		webBlog.setBlogAuthor((String) session.getAttribute("username"));
		blogService.addBlog(webBlog);
		return ConstantUtil.TO_WRITE_BLOG;
	}
}
