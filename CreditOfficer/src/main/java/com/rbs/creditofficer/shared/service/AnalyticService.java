package com.rbs.creditofficer.shared.service;
import java.util.List;

import com.rbs.creditofficer.shared.AnalyticsDto;

public interface AnalyticService  {
	List<AnalyticsDto> getAnalyticByCategory(String category);
	AnalyticsDto createRecord(AnalyticsDto dto);

}
