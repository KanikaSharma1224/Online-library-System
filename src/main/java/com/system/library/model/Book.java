package com.system.library.model;

public class Book {
	private String isbn;
	private String title;
	private String publisher;
	private String subject;
	private String language;
	private int numberOfPages;

	public Book(String isbn, String title, String publisher, String subject, String language, int pages) {
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.subject = subject;
		this.language = language;
		this.numberOfPages = pages;
	}
	
	public String getTitle() {
		return title;
	}

}
