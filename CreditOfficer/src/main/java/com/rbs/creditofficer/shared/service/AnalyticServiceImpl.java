package com.rbs.creditofficer.shared.service;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.creditofficer.data.AnalyticsEntity;
import com.rbs.creditofficer.exception.RecordNotFoundException;
import com.rbs.creditofficer.shared.AnalyticsDto;
import com.rbs.creditofficer.shared.repository.AnalyticRepository;

@Service
public class AnalyticServiceImpl implements AnalyticService {

	AnalyticRepository analyticRepository;
	
	@Autowired
	public AnalyticServiceImpl(AnalyticRepository analyticRepository)
	{
		this.analyticRepository = analyticRepository;
	}

	public List<AnalyticsDto> getAnalyticByCategory(String category) {
		List<AnalyticsEntity> entities = analyticRepository.findByCategory(category);
		if (entities.isEmpty())
			throw new RecordNotFoundException("No records Available");
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AnalyticsDto> analyticsDto = Arrays.asList(modelMapper.map(entities, AnalyticsDto[].class));
		return analyticsDto;
	}
	
	public AnalyticsDto createRecord(AnalyticsDto dto) {
		
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		if (null==dto.getCategory() || dto.getCategory().isEmpty())dto.setCategory("General");
		AnalyticsEntity entity = modelMapper.map(dto, AnalyticsEntity.class);
		analyticRepository.save(entity);
		AnalyticsDto returnValue = modelMapper.map(entity, AnalyticsDto.class);
		return returnValue;
	}

}
