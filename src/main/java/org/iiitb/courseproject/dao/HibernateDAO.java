package org.iiitb.courseproject.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class HibernateDAO<E> {
	protected Class<? extends E> daoType;
	Session session;
	Transaction tx;
	
	
	public int add(E entity)
	{
		session = SessionUtil.getSession();
		tx = session.beginTransaction();
		int id = (int)session.save(entity);
		session.flush();
		tx.commit();
		session.close();
		return id;
	}
	
	public void no_id_add(E entity)
	{
		session = SessionUtil.getSession();
		tx = session.beginTransaction();
		session.save(entity);
		session.flush();
		tx.commit();
		session.close();
	}
	

	
	@SuppressWarnings("unchecked")
	public E find(String entity_name, String param, String val)
	{
		session = SessionUtil.getSession();
		session.flush();
		String hql = "from "+ entity_name + " where "+param+" = :val";
		Query query = session.createQuery(hql);
		query.setParameter("val", val);
		List<E> entity = query.list();
		session.clear();
		session.flush();
		session.close();
		if (entity.size() == 0)
			return null;
		return entity.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public E find(String entity_name, String param, int val)
	{
		session = SessionUtil.getSession();
		session.flush();
		String hql = "from "+ entity_name + " where "+param+" = :val";
		Query query = session.createQuery(hql);
		query.setParameter("val", val);
		List<E> entity = query.list();
		session.clear();
		session.flush();
		session.close();
		if (entity.size() == 0)
			return null;
		return entity.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<E> list(E ent)
	{

		session = SessionUtil.getSession();
		session.flush();
		Query query = session.createQuery("from "+ ent.getClass().getName());
		List<E> entity = query.list();
		session.clear();
		session.flush();
		session.close();
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<E> findAll(String entity_name, String param, int val)
	{
		session = SessionUtil.getSession();
		session.flush();
		String hql = "from "+ entity_name + " where "+param+" = :val";
		Query query = session.createQuery(hql);
		query.setParameter("val", val);
		List<E> entity = query.list();
		session.clear();
		session.flush();
		session.close();
		return entity;
	}	
}