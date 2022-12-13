package com.ibm.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.bean.AnEvent;
import com.ibm.training.service.EventService;

@RestController
public class EventsController {

	@Autowired
	EventService eventService;
	
	@RequestMapping("/events")
	Iterable<AnEvent> getEvents() {
		return eventService.getEvents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/events")
	void saveEvent(@RequestBody AnEvent event){
		eventService.saveEvent(event);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/events/{id}")
	void deleteEvent(@PathVariable Integer id){
		eventService.deleteEvent(id);
	}
}
