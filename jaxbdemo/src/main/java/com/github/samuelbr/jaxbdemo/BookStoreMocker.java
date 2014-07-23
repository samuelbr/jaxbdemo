package com.github.samuelbr.jaxbdemo;

import java.util.List;
import java.util.Random;

import com.github.samuelbr.jaxbdemo.entity.Author;
import com.github.samuelbr.jaxbdemo.entity.Book;
import com.github.samuelbr.jaxbdemo.entity.BookStore;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class BookStoreMocker {

	private Random rnd = new Random();
	
	private List<Author> authors;
	
	private void prepareAuthorsIfNecessary() {
		if (authors != null) {
			return;
		}
		
		Builder<Author> builder = ImmutableList.builder();
		
		for (int a=0; a<20; a++) {
			builder.add(createAuthor(a));
		}
		
		authors = builder.build();
	}
	
	private Author createAuthor(int seed) {
		Author author = new Author();
		
		author.setName("Author "+seed);
		author.setNationality("Nationality "+seed);
		
		return author;
	}
	
	
	private Book createBook(int seed) {
		Book book = new Book();
		
		book.setPagesCount(rnd.nextInt(1000));
		book.setTitle("Book "+seed);
		book.setAuthor(authors.get(rnd.nextInt(authors.size())));
		
		return book;
	}
	
	public BookStore create() {
		prepareAuthorsIfNecessary();
		
		BookStore store = new BookStore();
		
		Builder<Book> builder = ImmutableList.builder();
		
		for (int a=0; a<100; a++) {
			builder.add(createBook(a));
		}
		
		store.setBooks(builder.build());
		
		return store;
	}
	
}
