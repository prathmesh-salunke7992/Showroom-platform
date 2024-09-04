package com.showroom.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.showroom.entity.Showroom;
import com.showroom.showroomutil.Databaseutil;

@Repository
public class ShowroomDao {

	public ArrayList<Showroom> fetchcars() {
		ArrayList<Showroom> al = new ArrayList<>();
		try {

			Connection connection = Databaseutil.createconnection("jdbc:mysql://localhost:3306/showroom", "root",
					"root");

			Statement Statement = Databaseutil.createstatement(connection);
			String query = "select * from tata";

			ResultSet rss = Databaseutil.generateResultSet(Statement, query);

			while (rss.next()) {
				Showroom ShowRoom1 = new Showroom();
				String name = rss.getNString(1);
				int price = rss.getInt(2);
				int year = rss.getInt(3);
				String type = rss.getString(4);
				int tyre = rss.getInt(5);
				String sunroof = rss.getString(6);
				String handbreake = rss.getString(7);
				String ac = rss.getString(8);
				String music = rss.getString(9);
				String camera = rss.getString(10);
				int downpayment = rss.getInt(11);
				int discount = rss.getInt(12);
				int intrest = rss.getInt(13);
				String warrenty = rss.getString(14);

				ShowRoom1.setCarname(name);
				ShowRoom1.setCarprice(price);
				ShowRoom1.setCarmanufactureyear(year);
				ShowRoom1.setCartype(type);
				ShowRoom1.setTyresize(tyre);
				ShowRoom1.setSunroof(sunroof);
				ShowRoom1.setHandbreake(handbreake);
				ShowRoom1.setAc(ac);
				ShowRoom1.setMusic(music);
				ShowRoom1.setCamera(camera);
				ShowRoom1.setCardownpayment(downpayment);
				ShowRoom1.setCardiscount(discount);
				ShowRoom1.setCarintrest(intrest);
				ShowRoom1.setCarwarrenty(warrenty);
				al.add(ShowRoom1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return al;
	}

	public Showroom fetchcarpername(String carname) {
		ArrayList<Showroom> al = new ArrayList<>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	

	public Showroom fetchcartype(String cartype) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchsunroof(String sunroof) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchhandbreake(String handbreake) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchac(String ac) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchmusic(String music) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcamera(String camera) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcarwarrenty(String carwarrenty) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcarperprice(int carprice) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcarmanufactureyear(int carmanufactureyear) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchtyresize(int tyresize) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcardownpayment(int cardownpayment) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcardiscount(int cardiscount) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

	public Showroom fetchcarintrest(int carintrest) {
		ArrayList<Showroom> al = new ArrayList<Showroom>();
		Showroom showroom = new Showroom();
		return showroom;
	}

}