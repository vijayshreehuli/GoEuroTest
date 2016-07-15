package com.goeuro.test.main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.goeuro.test.exception.ArgumentMissingException;
import com.goeuro.test.exception.NoCityDetailsFoundException;
import com.goeuro.test.model.CityDetailsPOJO;
import com.goeuro.test.reader.CsvFileWriter;
import com.goeuro.test.reader.URLReader;


public class GoEuroExecutor {

	public static void main(String[] args) throws ArgumentMissingException, MalformedURLException, IOException, NoCityDetailsFoundException {
		if(args.length<=0) {
			throw new ArgumentMissingException("City Not Found");
		}
		String cityName = args[0];
	    List<CityDetailsPOJO> cityDetailsList = URLReader.getCityDetailsList("http://api.goeuro.com/api/v2/position/suggest/en/"+cityName);
	    CsvFileWriter.writeCsvFile(cityDetailsList, "City.csv");
	}
}
