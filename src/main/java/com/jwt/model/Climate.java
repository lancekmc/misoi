package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Climate")
public class Climate implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public String getData_source_name() {
		return data_source_name;
	}

	public void setData_source_name(String data_source_name) {
		this.data_source_name = data_source_name;
	}

	
	public String getOther_indiv_aggre() {
		return other_indiv_aggre;
	}

	public void setOther_indiv_aggre(String other_indiv_aggre) {
		this.other_indiv_aggre = other_indiv_aggre;
	}


	@Column
	private String other_indiv_aggre;

	public String getEco_data() {
		return eco_data;
	}

	public void setEco_data(String eco_data) {
		this.eco_data = eco_data;
	}

	public String getOther_eco_data() {
		return other_eco_data;
	}

	public void setOther_eco_data(String other_eco_data) {
		this.other_eco_data = other_eco_data;
	}


	@Column
	private String other_eco_data;
	
	@Column
	private String eco_data;
	
	@Column
	private String data_source_name;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column
	private String url;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getDate_accessed() {
		return date_accessed;
	}

	public void setDate_accessed(String date_accessed) {
		this.date_accessed = date_accessed;
	}

	public String getRegions_covered() {
		return regions_covered;
	}

	public void setRegions_covered(String regions_covered) {
		this.regions_covered = regions_covered;
	}

	public String getSpatial_scale() {
		return spatial_scale;
	}

	public void setSpatial_scale(String spatial_scale) {
		this.spatial_scale = spatial_scale;
	}

	public String getSampling_units() {
		return sampling_units;
	}

	public void setSampling_units(String sampling_units) {
		this.sampling_units = sampling_units;
	}

	public String getData_available() {
		return data_available;
	}

	public void setData_available(String data_available) {
		this.data_available = data_available;
	}

	public String getIndividual_characteristics() {
		return individual_characteristics;
	}

	public void setIndividual_characteristics(String individual_characteristics) {
		this.individual_characteristics = individual_characteristics;
	}

	public String getPopulation_characteristics() {
		return population_characteristics;
	}

	public void setPopulation_characteristics(String population_characteristics) {
		this.population_characteristics = population_characteristics;
	}

	public String getHealth_data() {
		return health_data;
	}

	public void setHealth_data(String health_data) {
		this.health_data = health_data;
	}

	public String getClimate_data() {
		return climate_data;
	}

	public void setClimate_data(String climate_data) {
		this.climate_data = climate_data;
	}

	public String getSocio_eco() {
		return socio_eco;
	}

	public void setSocio_eco(String socio_eco) {
		this.socio_eco = socio_eco;
	}

	public String getOther_data() {
		return other_data;
	}

	public void setOther_data(String other_data) {
		this.other_data = other_data;
	}

	public String getTime_period_avail_data() {
		return time_period_avail_data;
	}

	public void setTime_period_avail_data(String time_period_avail_data) {
		this.time_period_avail_data = time_period_avail_data;
	}

	public String getFerquency_data_coll() {
		return ferquency_data_coll;
	}

	public void setFerquency_data_coll(String ferquency_data_coll) {
		this.ferquency_data_coll = ferquency_data_coll;
	}

	public String getOpen_source() {
		return open_source;
	}

	public void setOpen_source(String open_source) {
		this.open_source = open_source;
	}

	public String getTasks_involved() {
		return tasks_involved;
	}

	public void setTasks_involved(String tasks_involved) {
		this.tasks_involved = tasks_involved;
	}

	public String getObvious_limitations() {
		return obvious_limitations;
	}

	public void setObvious_limitations(String obvious_limitations) {
		this.obvious_limitations = obvious_limitations;
	}

	public String getSample_research_question() {
		return sample_research_question;
	}

	public void setSample_research_question(String sample_research_question) {
		this.sample_research_question = sample_research_question;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column
	private String date_accessed;

	
	@Column
	private String regions_covered;
	
	@Column
	private String spatial_scale;
	
	@Column
	private String sampling_units;
	
	@Column
	private String data_available;
	
	@Column
	private String individual_characteristics;

	@Column
	private String population_characteristics;
	
	@Column
	private String health_data;
	
	@Column
	private String climate_data;
	
	@Column
	private String socio_eco;
	
	@Column
	private String other_data;
	
	@Column
	private String time_period_avail_data;
	
	@Column
	private String ferquency_data_coll;
	
	@Column
	private String open_source;
	
	@Column
	private String tasks_involved;
	
	@Column
	private String obvious_limitations;
	
	@Column
	private String sample_research_question;
	
	@Column
	private String comments;

	public String getOther_region() {
		return other_region;
	}

	public void setOther_region(String other_region) {
		this.other_region = other_region;
	}

	public String getOther_spatial() {
		return other_spatial;
	}

	public void setOther_spatial(String other_spatial) {
		this.other_spatial = other_spatial;
	}

	public String getOther_individual_char() {
		return other_individual_char;
	}

	public void setOther_individual_char(String other_individual_char) {
		this.other_individual_char = other_individual_char;
	}

	public String getOther_population_char() {
		return other_population_char;
	}

	public void setOther_population_char(String other_population_char) {
		this.other_population_char = other_population_char;
	}

	public String getOther_health_data() {
		return other_health_data;
	}

	public void setOther_health_data(String other_health_data) {
		this.other_health_data = other_health_data;
	}

	public String getOther_climate_data() {
		return other_climate_data;
	}

	public void setOther_climate_data(String other_climate_data) {
		this.other_climate_data = other_climate_data;
	}

	public String getOther_socio_data() {
		return other_socio_data;
	}

	public void setOther_socio_data(String other_socio_data) {
		this.other_socio_data = other_socio_data;
	}

	public String getOther_freq_data() {
		return other_freq_data;
	}

	public void setOther_freq_data(String other_freq_data) {
		this.other_freq_data = other_freq_data;
	}

	@Column
	private String other_region;
	
	@Column
	private String other_spatial;
	
	@Column
	private String other_individual_char;

	@Column
	private String other_population_char;
	
	@Column
	private String other_health_data;
	
	@Column
	private String other_climate_data;
	
	@Column
	private String other_socio_data;
	
	@Column
	private String other_freq_data;
	//*	public String getData_Source_Name() {
//		return data_source_name;
//	}

//	public void setData_Source_Name(String data_source_name) {
//		this.data_source_name = data_source_name;
//	} 


}