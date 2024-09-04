package com.showroom.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.showroom.entity.Showroom;
import com.showroom.service.ShowroomService;

@RestController
public class ShowroomController {
	@Autowired
	ShowroomService showroomService;
	
	
	
	@GetMapping("fetchcars")
	public ArrayList<Showroom> fetchcars() {
		return showroomService.fetchcars();
	}

	@GetMapping("fetchcarpername/{carname}")
	public Object fetchcarpername(@PathVariable("carname") String carname) {
		return showroomService.fetchcarpername(carname);
	}

	@GetMapping("fetchcarperprice/{carprice}")
	public Object fetchcarperprice(@PathVariable int carprice) {
		return showroomService.fetchcarperprice(carprice);
	}
	
	
	@GetMapping("fetchcamera/{camera}")
	public Object fetchcamera(@PathVariable String camera) {
		return showroomService.fetchcamera(camera);
	}

	@GetMapping("fetchmusic/{music}")
	public Object fetchmusic(@PathVariable String music) {
		return showroomService.fetchmusic(music);
	}

	@GetMapping("fetchac/{ac}")
	public Object fetchac(@PathVariable String ac) {
		return showroomService.fetchac(ac);
	}

	@GetMapping("fetchhandbreake/{handbreake}")
	public Object fetchhandbreake(@PathVariable String handbreake) {
		return showroomService.fetchhandbreake(handbreake);
	}

	@GetMapping("fetchsunroof/{sunroof}")
	public Object fetchsunroof(@PathVariable String sunroof) {
		return showroomService.fetchsunroof(sunroof);
	}

	@GetMapping("fetchfetchcartype/{fetchcartype}")
	public Object fetchfetchcartype(@PathVariable String fetchcartype) {
		return showroomService.fetchfetchcartype(fetchcartype);
	}

	@GetMapping("fetchcarwarrenty/{carwarrenty}")
	public Object fetchcarwarrenty(@PathVariable String carwarrenty) {
		return showroomService.fetchcarwarrenty(carwarrenty);
	}

	@GetMapping("fetchcarmanufactureyear/{carmanufactureyear}")
	public Object fetchcarmanufactureyear(@PathVariable int carmanufactureyear) {
		return showroomService.fetchcarmanufactureyear(carmanufactureyear);
	}

	@GetMapping("fetchtyresize/{tyresize}")
	public Object fetchtyresize(@PathVariable int tyresize) {
		return showroomService.fetchtyresize(tyresize);
	}

	@GetMapping("fetchcardownpayment/{cardownpayment}")
	public Object fetchcardownpayment(@PathVariable int cardownpayment) {
		return showroomService.fetchcardownpayment(cardownpayment);
	}

	@GetMapping("fetchcardiscount/{cardiscount}")
	public Object fetchcardiscount(@PathVariable int cardiscount) {
		return showroomService.fetchcardiscount(cardiscount);
	}

	

	@GetMapping("fetchcarintrest/{carintrest}")
	public Object fetchcarintrest(@PathVariable int carintrest) {
		 return showroomService.fetchcarintrest(carintrest);}
}
