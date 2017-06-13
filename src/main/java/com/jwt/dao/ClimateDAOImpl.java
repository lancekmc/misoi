package com.jwt.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Climate;

@Repository
public class ClimateDAOImpl implements ClimateDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addClimate(Climate climate) {
		sessionFactory.getCurrentSession().saveOrUpdate(climate);

	}

	@SuppressWarnings("unchecked")
	public List<Climate> getAllClimates() {

		return sessionFactory.getCurrentSession().createQuery(" from Climate").list();
	}

	@Override
	public void deleteClimate(Integer climateId) {
		Climate climate = (Climate) sessionFactory.getCurrentSession().load(Climate.class, climateId);
		if (null != climate) {
			this.sessionFactory.getCurrentSession().delete(climate);
		}

	}

	public Climate getClimate(int climateid) {
		return (Climate) sessionFactory.getCurrentSession().get(Climate.class, climateid);
	}

	@Override
	public Climate updateClimate(Climate climate) {
		sessionFactory.getCurrentSession().update(climate);
		return climate;
	}
/* Ely working	@SuppressWarnings("unchecked")
	public List<Climate> getPersonByName(String name){
		return sessionFactory.getCurrentSession().createQuery("from Climate where url like %" + name + "%").list();
		System.out.println("name");
	}*/

	@SuppressWarnings("unchecked")
	public List<Climate> getClimateurl(String url){
		Query q=sessionFactory.getCurrentSession().createQuery("from Climate where url like :urlParameter");
		
	/*	q.setString("urlParameter" ,'%'+url+'%');
	 * 
	 */
		q.setString("urlParameter" ,'%'+url+'%' );
		return q.list();
		//System.out.println("name");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Climate> getClimatesscale(String spatial_scale) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from Climate where url like :sscaleParameter");
		
	/*	q.setString("urlParameter" ,'%'+url+'%');
	 * 
	 */
		q.setString("sscaleParameter" ,'%'+spatial_scale+'%' );
		return q.list();
	}
}