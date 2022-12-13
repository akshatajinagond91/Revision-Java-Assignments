package com.ibm.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.bean.AnEvent;
import com.ibm.training.dao.EventRepository;

@Service
public class EventService {

	@Autowired
	EventRepository eventRepository;
	
	public Iterable<AnEvent> getEvents() {
		return eventRepository.findAll();
	}

	public void saveEvent(AnEvent event) {
		eventRepository.save(event);
	}

	public void deleteEvent(Integer id) {
		eventRepository.deleteById(id);
	}

}
