package com.github.samuelbr.jaxbdemo.entity;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="BookStore", namespace="com.github.samuelbr.jaxbdemo")
public class BookStore {

	private Collection<Book> books;

	@XmlElement(name="BooksCollection")
	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
	
}
