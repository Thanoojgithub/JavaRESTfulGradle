package com.weatherreport.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

import com.google.gson.Gson;
import com.weatherreport.vo.JsontestTime;
import com.weatherreport.vo.WeatherByCityName;

public class WeatherReporterORJsontestTime {
	
	final static String operatingSystem = System.getProperty("os.name");
	
	public static void main(String[] args) {

		Gson gson = new Gson();
		// http://api.openweathermap.org/data/2.5/weather?q=Bangalore,in
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJaxbJsonProvider());
		try {
			WebClient client = WebClient.create("http://api.openweathermap.org/data/2.5", providers);
			client.header("x-api-key", "e9f3cc1492d40c5c0a28ea1f5f841c16");
			client = client.accept("application/json").type("application/json").path("/weather").query("q", "Bangalore,in");
			System.out.println("weather report for Bangalore,In - service calling");
			String str = client.get(String.class);
			Object fromJson = gson.fromJson(str, new com.google.gson.reflect.TypeToken<WeatherByCityName>() {}.getType());
			System.out.println("weather report for Bangalore,In ::" + fromJson);
		} catch (Exception e) {
			/**
			 * As weather report using 'http://openweathermap.org' is NOT WORKING, we are doing an alternative call with 'http://www.jsontest.com'
			 */
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("***As weather report using 'http://openweathermap.org' is NOT WORKING, we are doing an alternative call with 'http://www.jsontest.com'***");
			WebClient client = WebClient.create("http://time.jsontest.com/", providers);
			client = client.accept("application/json").type("application/json");
			String str = client.get(String.class);
			JsontestTime jsontestTime = (JsontestTime) gson.fromJson(str, new com.google.gson.reflect.TypeToken<JsontestTime>() {}.getType());
			System.out.println("");
			System.out.println("Date & Time ::" + ToStringBuilder.reflectionToString(jsontestTime, RecursiveToStringStyle.JSON_STYLE));
		}
	}

}
