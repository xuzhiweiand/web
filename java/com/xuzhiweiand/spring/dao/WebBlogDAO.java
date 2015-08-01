package com.xuzhiweiand.spring.dao;

import java.util.List;

import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.object.PageInfo;

/**
 * 博客数据访问类
 * 
 * @author xuzhiweiand
 *
 */
public interface WebBlogDAO {
	/**
	 * 添加一条博客
	 * 
	 * @param webBlog一条博客
	 */
	public void addBlog(WebBlog webBlog);
	/**
	 * 查询所有的博客
	 * @return
	 */
	public List<WebBlog> getWebBlogs();
	/**
	 * 首页分页查询博客
	 * @param from
	 * @param to
	 * @return
	 */
	public PageInfo<WebBlog> getWebBlogsForIndex(int start, int size);
}
