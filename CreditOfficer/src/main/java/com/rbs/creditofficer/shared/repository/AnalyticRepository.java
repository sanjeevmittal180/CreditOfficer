package com.rbs.creditofficer.shared.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rbs.creditofficer.data.AnalyticsEntity;

public interface AnalyticRepository extends CrudRepository<AnalyticsEntity, Long> {
	
	List<AnalyticsEntity> findByCategory(String category);
}
