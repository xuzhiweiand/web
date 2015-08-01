package com.xuzhiweiand.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.xuzhiweiand.spring.dao.WebBlogDAO;
import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.object.PageInfo;
import com.xuzhiweiand.spring.utils.ConstantUtil;
import com.xuzhiweiand.spring.utils.HtmlUtil;

@Service
@Transactional
public class WebBlogServiceImpl implements WebBlogService {

	@Inject
	private WebBlogDAO blogDAO;

	@Override
	@Transactional
	public void addBlog(WebBlog webBlog) {
		Assert.notNull(webBlog, "请写博客");
		Assert.hasText(webBlog.getBlogTitle(), "请写博客标题");
		Assert.hasText(webBlog.getBlogContent(), "请写博客内容");
		blogDAO.addBlog(webBlog);
	}

	@Override
	public List<WebBlog> getWebBlogs() {
		List<WebBlog> webBlogs = blogDAO.getWebBlogs();
		if (CollectionUtils.isEmpty(webBlogs)) {
			return new ArrayList<WebBlog>();
		}
		return webBlogs;
	}

	@Override
	public PageInfo<WebBlog> getWebBlogsForIndex(Integer start, Integer size) {
		if (start == null) {
			start = 0;
		}
		PageInfo<WebBlog> webBlogs = blogDAO.getWebBlogsForIndex(start, size);
		List<WebBlog> webBlogList = new ArrayList<WebBlog>();

		for (WebBlog object : webBlogs.getObjects()) {
			object.setBlogContent(HtmlUtil.getTextFromHtml(object.getBlogContent(), ConstantUtil.BLOG_LENGTH) + "...");
			webBlogList.add(object);
		}
		return webBlogs;
	}
}
