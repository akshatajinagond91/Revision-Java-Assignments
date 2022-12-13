package com.ibm.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibm.training.bean.AnEvent;

public interface EventRepository extends CrudRepository<AnEvent, Integer> {
	
}
