package com.goeuro.test.model;

public class CityDetailsPOJO {
	public Integer _id;
	public String name;
	public String fullName;
	public String iata_airport_code;
	public String type;
	public String country;
	public Integer location_id;
	public boolean inEurope;
	public String countryCode;
	public String coreCountry;
	public String distance;
	public GeoPosition geo_position;

	public class GeoPosition {
		public Double latitude;
		public Double longitude;
	}
}


