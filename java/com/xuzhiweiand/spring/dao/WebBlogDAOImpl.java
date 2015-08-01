package com.xuzhiweiand.spring.dao;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xuzhiweiand.spring.domain.WebBlog;
import com.xuzhiweiand.spring.object.PageInfo;

@Repository
@Transactional
public class WebBlogDAOImpl implements WebBlogDAO {
	@Inject
	private SessionFactory sessionFactory;
	@Inject
	private DBUtil dbUtil;

	@Override
	@Transactional
	public void addBlog(WebBlog webBlog) {
		Date curTime = dbUtil.getCurDBTime();
		webBlog.setBlogCreateTime(curTime);
		webBlog.setBlogUpdateTime(curTime);
		sessionFactory.getCurrentSession().saveOrUpdate(webBlog);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<WebBlog> getWebBlogs() {
		Session session = sessionFactory.getCurrentSession();
		List<WebBlog> webBlogs = session.createQuery("FROM WebBlog T ORDER BY T.blogCreateTime DESC").list();
		return webBlogs;
	}

	@Override
	@SuppressWarnings("unchecked")
	public PageInfo<WebBlog> getWebBlogsForIndex(int start, int size) {
		String sql = "SELECT T.BLOG_ID, T.BLOG_AUTHOR, T.BLOG_TITLE, T.BLOG_CONTENT, T.BLOG_CREATE_TIME, T.BLOG_UPDATE_TIME FROM WEB_BLOG T ORDER BY T.BLOG_CREATE_TIME DESC";
		PageInfo<WebBlog> pageInfo = new PageInfo<WebBlog>();
		Session session = sessionFactory.getCurrentSession();
//		List<WebBlog> webBlogs = session.createSQLQuery("FROM WebBlog T ORDER BY T.blogCreateTime DESC").addEntity(WebBlog.class).setFirstResult(start).setMaxResults(size).list();
		List<WebBlog> webBlogs = session.createSQLQuery(sql).addEntity(WebBlog.class).setFirstResult(start).setMaxResults(size).list();
		pageInfo.setObjects(webBlogs);
		pageInfo.setStart(start);
		pageInfo.setSize(size);

		return pageInfo;
	}

}
