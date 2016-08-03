package com.niit.insbackend.doa;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.insbackend.model.Products;

@Repository("ProductsDao")

public class ProductsDaoImpl implements ProductsDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	public ProductsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(Products products) {
		sessionFactory.getCurrentSession().saveOrUpdate(products);
			
	}
	
	@Transactional
	public void delete(String id) {
		Products products = new Products();
		products.setP_id(id);
		sessionFactory.getCurrentSession().delete(products);
	}
	
	@Transactional
	public Products get(String P_id) {
		String hql = "from Products where P_id=" + "'"+ P_id +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		List<Products> listCategory = (List<Products>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Products> getAllProducts() {
		@SuppressWarnings("unchecked")
		List<Products> listCategory = (List<Products>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Products.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	public void saveorupdate(Products products) {
		// TODO Auto-generated method stub
		
	}


}

