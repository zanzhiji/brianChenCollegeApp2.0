package model;

import java.io.Serializable;

public class Textbook implements Comparable<Textbook>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int pages;
	
	public Textbook(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	@Override
	public int compareTo(Textbook o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Textbook [title=" + title + ", author=" + author + ", pages=" + pages + "]";
	}

}
