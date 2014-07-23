package com.github.samuelbr.jaxbdemo.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Book", namespace="com.github.samuelbr.jaxbdemo")
public class Book {

	private Author author;
	
	private String title;
	
	private int pagesCount;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}
	
}
