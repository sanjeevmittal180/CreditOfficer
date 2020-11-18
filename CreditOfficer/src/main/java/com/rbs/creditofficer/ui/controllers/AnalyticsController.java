package com.rbs.creditofficer.ui.controllers;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.creditofficer.shared.AnalyticsDto;
import com.rbs.creditofficer.shared.service.AnalyticService;
import com.rbs.creditofficer.ui.model.AnalyticsRequestModel;
import com.rbs.creditofficer.ui.model.AnalyticsResponseModel;

@RestController
@RequestMapping("/web")
public class AnalyticsController {

	@Autowired
	AnalyticService analyticService;
	
	@GetMapping(value="/{category}", produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<AnalyticsResponseModel>> getAnalytics(@PathVariable("category") String category) {
		List<AnalyticsDto> list = analyticService.getAnalyticByCategory(category);
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AnalyticsResponseModel> response = Arrays.asList(modelMapper.map(list, AnalyticsResponseModel[].class));
		return new ResponseEntity<List<AnalyticsResponseModel>>(response, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@PostMapping(
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<AnalyticsResponseModel> createRecord(@Valid @RequestBody AnalyticsRequestModel details)
	{
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		AnalyticsDto analyticsDto = modelMapper.map(details, AnalyticsDto.class);
		
		AnalyticsDto analysisDto = analyticService.createRecord(analyticsDto);
		
		AnalyticsResponseModel returnValue = modelMapper.map(analysisDto, AnalyticsResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
	
	
	
	
	
}
