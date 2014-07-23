package com.github.samuelbr.jaxbdemo;

import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;

import com.github.samuelbr.jaxbdemo.entity.BookStore;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Marshaller marshaller = ctx.getBean(Marshaller.class);
		
		BookStoreMocker mocker = new BookStoreMocker();
		BookStore bookStore = mocker.create();
		
		try {
			marshaller.marshal(bookStore, new StreamResult(System.out));
		} catch (XmlMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		 } finally {
			 ctx.close();	 
		 }
		
	}
}
