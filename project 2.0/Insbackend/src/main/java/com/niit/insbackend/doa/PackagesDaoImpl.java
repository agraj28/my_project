package com.niit.insbackend.doa;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.insbackend.model.Packages;

@Repository("PackagesDao")

public class PackagesDaoImpl implements PackagesDao {
private SessionFactory sessionFactory;
	

	public PackagesDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(Packages pack) {
		sessionFactory.getCurrentSession().saveOrUpdate(pack);
			
	}
	
	@Transactional
	public void delete(String pa_id) {
		Packages pack = new Packages();
		pack.setPa_id(pa_id);
		sessionFactory.getCurrentSession().delete(pack);
	}
	
	@Transactional
	public Packages get(String pa_id) {
		String hql = "from Products where pa_id=" + "'"+ pa_id +"'";
		//  from category where id = '101'
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		List<Packages> listCategory = (List<Packages>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Packages> getAllPackages() {
		@SuppressWarnings("unchecked")
		List<Packages> listCategory = (List<Packages>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Packages.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	public void saveorupdate(Packages pack) {
		// TODO Auto-generated method stub
		
	}

}
