package com.system.library.model;

import java.time.LocalDate;

public class BookItem extends Book {
	private String barcode;
	private boolean isReferenceOnly;
	private LocalDate borrowed;
	private LocalDate dueDate;
	private double price;
	private BookFormat format;
	private BookStatus status;
	private LocalDate dateOfPurchase;
	private LocalDate publicationDate;

	public BookItem(String isbn, String title, String publisher, String subject, String language, int numberOfPages,
			String barcode, boolean isReferenceOnly, LocalDate borrowed, LocalDate dueDate, double price,
			BookFormat format, BookStatus status, LocalDate dateOfPurchase, LocalDate publicationDate) {
		super(isbn, title, publisher, subject, language, numberOfPages);
		this.barcode = barcode;
		this.isReferenceOnly = isReferenceOnly;
		this.borrowed = borrowed;
		this.dueDate = dueDate;
		this.price = price;
		this.format = format;
		this.status = status;
		this.dateOfPurchase = dateOfPurchase;
		this.publicationDate = publicationDate;

	}

}
