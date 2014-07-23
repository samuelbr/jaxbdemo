package com.github.samuelbr.jaxbdemo.entity;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="BookStore")
@XmlType(name="BookStore", namespace="com.github.samuelbr.jaxbdemo")
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
