package com.github.samuelbr.jaxbdemo;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.google.common.collect.ImmutableMap;

@Configuration
public class Config {

	@Bean
	public Marshaller getMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		
		Map<String, Object> props = ImmutableMap.<String, Object>of(
			javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true
		);
		
		marshaller.setMarshallerProperties(props);
		marshaller.setPackagesToScan(new String[] {"com.github.samuelbr.jaxbdemo.entity"});
		
		return marshaller;
	}
	
}
