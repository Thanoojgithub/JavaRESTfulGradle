package com.javarestfulgradle.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.jaxrs.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.javarestfulgradle.vo.JsontestTime;

public class JsontestTimeImpl implements IJsontestTime{
	
	private final Logger logger = LoggerFactory.getLogger(JsontestTimeImpl.class);
	
	@Override
	public JsontestTime getJsontestTime() {
		logger.info("getJsontestTime method call start");
		ObjectMapper mapper = new ObjectMapper();
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		JsontestTime jsontestTime = null;
		try {
			WebClient client = WebClient.create("http://time.jsontest.com/", providers).type("application/json");
			String jsonStr = client.get(String.class);
			jsontestTime = mapper.readValue(jsonStr, JsontestTime.class);
			System.out.println("########################################");
			System.out.println("\nDate & Time :: " + ToStringBuilder.reflectionToString(jsontestTime, RecursiveToStringStyle.JSON_STYLE));
			System.out.println("\n########################################");
			logger.info("getJsontestTime method call end");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return jsontestTime;
	}

}
