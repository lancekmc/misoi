package com.jwt.dao;

import java.util.List;
import com.jwt.model.Climate;

public interface ClimateDAO {

	public void addClimate(Climate climate);

	public List<Climate> getAllClimates();

	public void deleteClimate(Integer climateId);

	public Climate updateClimate(Climate climate);

	public Climate getClimate(int climateid);
	
	public List<Climate> getClimateurl(String url);

	public List<Climate> getClimatesscale(String spatial_scale);
	
//	public List<Climate> getPersonByName(String name);
}
