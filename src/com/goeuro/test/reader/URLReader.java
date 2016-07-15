package com.goeuro.test.reader;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.goeuro.test.exception.NoCityDetailsFoundException;
import com.goeuro.test.model.CityDetailsPOJO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class URLReader {
	
	public static List<CityDetailsPOJO> getCityDetailsList(String url) throws MalformedURLException, IOException, NoCityDetailsFoundException {
		String jsonString = IOUtils.toString(new URL(url).openStream(),"UTF-8");
		Gson gson = new Gson();
	    Type listOfTestObject = new TypeToken<List<CityDetailsPOJO>>(){}.getType();
	    List<CityDetailsPOJO> cityDetailsList = gson.fromJson(jsonString, listOfTestObject);
	    if(cityDetailsList.size()<=0) {
	    	throw new NoCityDetailsFoundException("City Name is not valid");
	    }
	    return cityDetailsList;
	}

}
