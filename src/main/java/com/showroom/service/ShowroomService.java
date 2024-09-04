package com.showroom.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.showroom.dao.ShowroomDao;
import com.showroom.entity.Showroom;

@Service
public class ShowroomService {

	@Autowired
	ShowroomDao showroomDao;

	public ArrayList<Showroom> fetchcars() {
		return showroomDao.fetchcars();
	}

	public Object fetchcarpername(String carname) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (carname.equals(showroom1.getCarname())) {
				showroom = showroom1;
			}
		}
		if (showroom == null) {
			return "Car Not Found ";
		}
		return al;
	}

	public Object fetchcarperprice(int carprice) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom =null;
		for (Showroom showroom1 : al) {
             if(carprice == showroom1.getCarprice() ) {
            	 showroom = showroom1; 
             }
		}
		if(showroom == null) {
			return "Carprice Not Found";
		}
		return al;
	}

	public Object fetchfetchcartype(String fetchcartype) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (fetchcartype.equals(showroom1.getCartype())) {
				showroom=showroom1;
			}
		}
		if(showroom == null) {
			return "Cartype Not Found";
		}
		return al;
	}

	public Object fetchsunroof(String sunroof) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (sunroof.equals(showroom1.getSunroof())) {
				showroom=showroom1;
			}
			
		}
		if(showroom == null) {
			return "Sunroof Not Found";
		}
		return al;
	}

	public Object  fetchhandbreake(String handbreake) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (handbreake.equals(showroom1.getHandbreake())) {
				showroom=showroom1;
			}
		}
		if(showroom == null) {
			return "HandBrake Not Found";
		}
		return al;
	}

	public Object fetchac(String ac) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (ac.equals(showroom1.getAc())) {
				showroom =showroom1;
			}
		}
		if(showroom == null) {
			return "Ac Not Found";
		}
		return al;
	}

	public Object fetchmusic(String music) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (music.equals(showroom1.getMusic())) {
				showroom= showroom1;
			}
		}
		if(showroom==null) {
			return "Music Not Found";
		}
		return al;
	}

	public Object fetchcamera(String camera) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (camera.equals(showroom1.getCamera())) {
				showroom=showroom1;
			}
		}
		if(showroom == null) {
			return "Camera Not Found";
		}
		return al;
	}

	public Object fetchcarwarrenty(String carwarrenty) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (carwarrenty.equals(showroom1.getCarwarrenty())) {
				showroom=showroom1;
			}
		}
		if(showroom==null) {
			return "Carwarrenty Not Found";
		}
		return al;
	}

	public Object fetchcarmanufactureyear(int carmanufactureyear) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (carmanufactureyear == showroom1.getCarmanufactureyear()) {
				showroom=showroom1;
			}
		}
		if(showroom==null) {
			return "Carmanufactureyear Not Found";
		}
		return al;
	}

	public Object fetchtyresize(int tyresize) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (tyresize == showroom1.getTyresize()) {
				showroom1=showroom;
			}
		}
		if(showroom == null) {
			return "Tyresize Not Found";
		}
		return al;
	}

	public Object  fetchcardownpayment(int cardownpayment) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom =null;
		for (Showroom showroom1 : al) {
			if (cardownpayment == showroom1.getCardownpayment()) {
				showroom=showroom1;
			}
		}
		if(showroom==null) {
			return "Cardownpayment Not Found";
		}
		return al;
	}

	public Object fetchcardiscount(int cardiscount) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (cardiscount == showroom1.getCardiscount()) {
				showroom=showroom1;
			}
		}
		if(showroom==null) {
			return "Cardiscount Not Found";
		}
		return al;
	}

	public Object fetchcarintrest(int carintrest) {
		ArrayList<Showroom> al = showroomDao.fetchcars();
		Showroom showroom = null;
		for (Showroom showroom1 : al) {
			if (carintrest == showroom1.getCarintrest()) {
				showroom=showroom1;
			}
		}
		if(showroom==null) {
			return "Carintrest Not Found";
		}
		return al;
	}
}
