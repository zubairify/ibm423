package com.ibm.lib;

public class Member {
	private String name;
	private Book book;
	
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void status() {
		if(book == null)
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " had issued " + book.getTitle());
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
