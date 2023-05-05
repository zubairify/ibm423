package com.ibm.lib;

public class Book {
	private String title;
	private Member member;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void status() {
		if(member == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + member.getName());
	}
	
	public void issueBook(Member m) {
		if(member == null && m.getBook() == null) {
			// Issuing book
			this.member = m;
			m.setBook(this);
		} else 
			System.out.println(title + " cannot be issued");
	}
	
	public void returnBook(Member m) {
		if(member != null && m.getBook() != null) {
			// Returning book
			this.member = null;
			m.setBook(null);
		} else
			System.out.println(title + " cannot be returned");
	}
}
