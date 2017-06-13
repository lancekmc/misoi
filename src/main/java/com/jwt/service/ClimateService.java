package com.jwt.service;

import java.util.List;

import com.jwt.model.Climate;

public interface ClimateService {
	
	public void addClimate(Climate climate);

	public List<Climate> getAllClimate();

	public void deleteClimate(Integer climateId);

	public Climate getClimate(int climateid);

	public Climate updateClimate(Climate climate);
	
	public List<Climate> getClimateurl(String url);
	
	public List<Climate> getPersonByName(String name);
}
