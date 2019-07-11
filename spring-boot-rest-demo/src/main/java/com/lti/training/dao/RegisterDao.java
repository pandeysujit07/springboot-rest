package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.User;

//@Component
@Repository
public class RegisterDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public int save(User user) {
	User u=	entityManager.merge(user);
	return u.getId();
	
	}

	public User search(User user) {
		String s=user.getEmail();
		Query q=entityManager.createQuery("select u from User u from u.email =:em");
		q.setParameter("em", s);
		User us=(User)q.
	}
	
	
	
}
