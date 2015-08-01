package com.xuzhiweiand.spring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "WEB_BLOG")
public class WebBlog implements Serializable{

	private static final long serialVersionUID = -5640221642675847004L;
	
	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@Column(name = "BLOG_ID", length = 32)
	private String blogId;
	@Column(name = "BLOG_AUTHOR")
	private String blogAuthor;
	@Column(name = "BLOG_TITLE", length = 500)
	private String blogTitle;
	@Column(name = "BLOG_CONTENT", length = 16777215)
	private String blogContent;
	@Column(name = "BLOG_CREATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date blogCreateTime;
	@Column(name = "BLOG_UPDATE_TIME", length = 32)
	@Temporal(TemporalType.TIMESTAMP)
	private Date blogUpdateTime;

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getBlogAuthor() {
		return blogAuthor;
	}

	public void setBlogAuthor(String blogAuthor) {
		this.blogAuthor = blogAuthor;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public Date getBlogCreateTime() {
		return blogCreateTime;
	}

	public void setBlogCreateTime(Date blogCreateTime) {
		this.blogCreateTime = blogCreateTime;
	}

	public Date getBlogUpdateTime() {
		return blogUpdateTime;
	}

	public void setBlogUpdateTime(Date blogUpdateTime) {
		this.blogUpdateTime = blogUpdateTime;
	}

}
