import object.*;
import Files.*;
import Algoritem.*;
import Filter.*;

import java.io.IOException;
import java.util.ArrayList;

import Files.FileCsv;
import Files.FileKml;
import object.Scan;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a =System.currentTimeMillis();
		/**
//		 * read wigle-wifi files and filter them by Scan
//		 */

		FileCsv fe = new FileCsv();
		Database data = new Database(fe.readForCsv("database"));
		System.out.println("num of object = "+data.getDatabase().size());
		try {
			fe.writecsv(data.getDatabase(), "Table.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * enter Database
		 */
		FileKml fl = new FileKml();
		//data.addArrayList( fl.readFromCsv("Table.csv"));
		/**
		 *   turn on the kml with filters
		 */
		ChooseFilter k = new ChooseFilter();
		//	k.ChekFilterForKml(data);

		/**
		 * turn on the Algoritem for calculate approximate location, and the csv files we want to check
		 */
	//	ArrayList<Scan> sample = fl.readFromCsv("C:\\Users\\yitzhak\\Desktop\\_comb_no_gps_ts1.csv");
		Algoritem temp1 = new Algoritem();
		//temp1.algo2tocsv(data, sample);
		temp1.algo1tocsv(data.getDatabase());
		System.out.println(temp1.algo1Hash(data.getDatabase()).size());

		long b= System.currentTimeMillis();
		System.out.println(b-a);

	}

}
