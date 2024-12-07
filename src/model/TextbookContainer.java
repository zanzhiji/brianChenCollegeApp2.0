package model;

import java.io.Serializable;

public class TextbookContainer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GenericBag<Textbook> texCon;
	
	public TextbookContainer(int capacity) {
		this.texCon = new GenericBag<>(Textbook.class, capacity);
	}
}
