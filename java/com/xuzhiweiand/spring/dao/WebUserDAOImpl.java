package com.xuzhiweiand.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xuzhiweiand.spring.domain.WebUser;

@Repository
public class WebUserDAOImpl implements WebUserDAO {
	@Inject
	private SessionFactory sessionFactory;

	@Override
	public List<WebUser> getWebUserByUserName(WebUser webUser) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM WebUser T WHERE 1 = 1 AND T.username=:username AND T.password=:password");
		query.setParameter("username", webUser.getUsername());
		query.setParameter("password", webUser.getPassword());
		@SuppressWarnings("unchecked")
		List<WebUser> users = query.list();
		return users;
	}
}
