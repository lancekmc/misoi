package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ClimateDAO;
import com.jwt.model.Climate;

@Service
@Transactional
public class ClimateServiceImpl implements ClimateService {

	@Autowired
	private ClimateDAO climateDAO;

	@Override
	@Transactional
	public void addClimate(Climate climate) {
		climateDAO.addClimate(climate);
	}

	@Override
	@Transactional
	public List<Climate> getAllClimate() {
		return climateDAO.getAllClimates();
	}

	@Override
	@Transactional
	public void deleteClimate(Integer climateId) {
		climateDAO.deleteClimate(climateId);
	}

	public Climate getClimate(int climateid) {
		return climateDAO.getClimate(climateid);
	}

	public Climate updateClimate(Climate climate) {
		// TODO Auto-generated method stub
		return climateDAO.updateClimate(climate);
	}

	public void setClimateDAO(ClimateDAO climateDAO) {
		this.climateDAO = climateDAO;
	}

	public List<Climate> getClimateurl(String url){
		return climateDAO.getClimateurl(url);
	}

	@Override
	public List<Climate> getPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
