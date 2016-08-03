package com.niit.insbackend.doa;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.insbackend.model.Ins;

@Repository("InsDao")

public class InsDaoImpl implements InsDao {

	private SessionFactory sessionFactory;
	

	public InsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(Ins ins) {
		sessionFactory.getCurrentSession().saveOrUpdate(ins);
			
	}
	
	@Transactional
	public void delete(String ins_id) {
		Ins ins = new Ins();
		ins.setIns_id(ins_id);
		sessionFactory.getCurrentSession().delete(ins);
	}
	
	@Transactional
	public Ins get(String ins_id) {
		String hql = "from Products where ins_id=" + "'"+ ins_id +"'";
		//  from category where id = '101'
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		List<Ins> listCategory = (List<Ins>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Ins> getAllIns() {
		@SuppressWarnings("unchecked")
		List<Ins> listCategory = (List<Ins>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Ins.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	public void saveorupdate(Ins ins) {
		// TODO Auto-generated method stub
		
	}



}
