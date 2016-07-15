package com.goeuro.test.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.goeuro.test.model.CityDetailsPOJO;

public class CsvFileWriter {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	private static final String FILE_HEADER = " _id, name, type, latitude, longitude";

	public static void writeCsvFile(List<CityDetailsPOJO> cityDetailsList,
			String fileName) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write citydetails object list to the CSV file
			for (CityDetailsPOJO cityDetails : cityDetailsList) {
				fileWriter.append(String.valueOf(cityDetails._id));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(cityDetails.name);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(cityDetails.type);
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String
						.valueOf(cityDetails.geo_position.latitude));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String
						.valueOf(cityDetails.geo_position.longitude));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out
						.println("Error while flushing/closing fileWriter !!!");
			}

		}
	}
}