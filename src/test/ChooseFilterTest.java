package test;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import Filter.ChooseFilter;
import object.Cordinate;
import object.Database;
import object.Scan;
import object.WifiData;

public class ChooseFilterTest {

	@Test
	public void testChekFilterForKml() {
		ChooseFilter f = new ChooseFilter();
		Database num = new Database();
		ArrayList<WifiData> t = new ArrayList<WifiData>();
		Cordinate cor = new Cordinate(32, 34, 21);
		Scan temp = new Scan("28/10/2017  20:10:00", "ONEPLUS A3003_28_171012", cor,  t);
		num.getDatabase().add(temp);
		num.getDatabase().add(temp);
		num.getDatabase().add(temp);
		num.getDatabase().add(temp);
		num.getDatabase().add(temp);
		Database d = new Database();
			if (!f.ChekFilterForKml(num).equals(d)) 
				fail("there is problem with the method ChekFilterForKml");
	}
	@Test
	public void testCheckinput() {
		ChooseFilter f = new ChooseFilter();
		if (!f.checkinput("2017/09/18", "yyyy/mm/dd") || !f.checkinput("12:30:00", "hh:mm:ss"))
			fail("There is a broblem with the method Checkinput");
	}
	@Test
	public void testCheckTime() {
		ChooseFilter f = new ChooseFilter();
		String s = f.CheckTime("10/07/2017 12:30:00");
		String l = f.CheckTime("2017/07/10 12:30:00");
		if (!s.equals("2017-07-10 12:30:00"))
			fail("There is a broblem with the method CheckTime");
	}
	
	
	

}
