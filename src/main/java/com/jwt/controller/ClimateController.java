package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Climate;
import com.jwt.service.ClimateService;

@Controller
public class ClimateController {

	private static final Logger logger = Logger
			.getLogger(ClimateController.class);

	public ClimateController() {
		System.out.println("ClimateController()");
	}

	@Autowired
	private ClimateService climateService;

	@RequestMapping(value = "/")
	public ModelAndView listClimate(ModelAndView model) throws IOException {
		List<Climate> listClimate = climateService.getAllClimate();
		model.addObject("listClimate", listClimate);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newClimate", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Climate climate = new Climate();
		model.addObject("climate", climate);
		model.setViewName("ClimateForm");
		return model;
	}

	@RequestMapping(value = "/saveClimate", method = RequestMethod.POST)
	public ModelAndView saveClimate(@ModelAttribute Climate climate) {
		if (climate.getId() == 0) { // if climate id is 0 then creating the
			// new climate data source other updating the existing record
			climateService.addClimate(climate);
		} else {
			climateService.updateClimate(climate);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteClimate", method = RequestMethod.GET)
	public ModelAndView deleteClimate(HttpServletRequest request) {
		int climateId = Integer.parseInt(request.getParameter("id"));
		climateService.deleteClimate(climateId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editClimate", method = RequestMethod.GET)
	public ModelAndView editClimate(HttpServletRequest request) {
		int climateId = Integer.parseInt(request.getParameter("id"));
		Climate climate = climateService.getClimate(climateId);
		ModelAndView model = new ModelAndView("ClimateForm");
		model.addObject("climate", climate);

		return model;
	}
	//Search display modelView
	@RequestMapping(value = "/urlSearch",method=RequestMethod.POST)
	public ModelAndView searchClimate(HttpServletRequest request, ModelAndView model) throws IOException {
		String url=request.getParameter("search");
		List<Climate> searchClimateList = climateService.getClimateurl(url);
		model.addObject("searchClimate", searchClimateList);
		model.setViewName("urlSearch");
		return model;
	}	
}