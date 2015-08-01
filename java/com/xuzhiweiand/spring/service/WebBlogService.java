package com.xuzhiweiand.spring.service;

import java.util.List;

import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.object.PageInfo;

/**
 * 
 * @author xuzhiweiand
 *
 */
public interface WebBlogService {
	/**
	 * 添加一条博客
	 * 
	 * @param webBlog一条博客
	 * @throws Exception
	 */
	public void addBlog(WebBlog webBlog);

	public List<WebBlog> getWebBlogs();
	
	public PageInfo<WebBlog> getWebBlogsForIndex(Integer start, Integer size);
}
