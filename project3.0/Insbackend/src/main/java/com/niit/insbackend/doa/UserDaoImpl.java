package com.niit.insbackend.doa;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.insbackend.model.User;

@Repository("UserDao")

public class UserDaoImpl implements UserDao {
private SessionFactory sessionFactory;
	

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
			
	}
	
	
	

	
	@Transactional
	public List<User> getAllUser() {
		@SuppressWarnings("unchecked")
		List<User> listCategory = (List<User>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	public void saveorupdate(User user) {
		// TODO Auto-generated method stub
		
	}

}
