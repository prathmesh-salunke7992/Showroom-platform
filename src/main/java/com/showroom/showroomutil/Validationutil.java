package com.showroom.showroomutil;

public class Validationutil {

	public  boolean checkString(String check) {

		if (check == null) {
			return false;
		}
		if (check != null && check.trim() == "") {
			return false;
		}
		return true;
	}
	
	public  boolean checknum( int checknum) {
		if(checknum<=0) {
			return true;
		}
		return false;
	}
}
