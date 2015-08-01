package com.xuzhiweiand.spring.dao;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

@Repository
public class DBUtil {
	@Inject
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public Date getCurDBTime() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT NOW()");
		List<Date> dates = query.list();
		if(CollectionUtils.isEmpty(dates)){
			return new Date();
		}
		return dates.get(0);
	}
}
