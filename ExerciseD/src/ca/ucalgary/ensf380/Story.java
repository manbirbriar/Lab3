package ca.ucalgary.ensf380;

/*
 * Story.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.0
 */

public class Story {
	private Author[] theAuthors;
	
	
	public String plot() {
		return "Method called plot called from Story";
	}
	
	public Author[] getTheAuthors() {
		return theAuthors;
	}
	
	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}
}
