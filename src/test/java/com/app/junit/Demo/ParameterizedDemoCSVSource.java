package com.app.junit.Demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedDemoCSVSource {
	
	@ParameterizedTest(name = "CSV Source {arguments}")
	@CsvSource({
		"Audi, 25",
		"BMW,  10",
		"Benz, 15",
		"Ford, 50"
	})
	public void datafrom_CSVsource(String car, String quantity) {
		
		System.out.println(car+ " : " +quantity);
	}

}
