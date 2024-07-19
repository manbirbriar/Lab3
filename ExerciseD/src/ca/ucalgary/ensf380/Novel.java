package ca.ucalgary.ensf380;

/*
 * Novel.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.2
 */

public class Novel extends Fiction{
	private Author[] theAuthor;
	private Series mySeries;
	
	
	public String theme() {
		return "Method theme called from Novel";
	}
	
	public Author[] getTheAuthor() {
		return theAuthor;
	}
	
	public void setTheAuthor(Author[] theAuthor) {
		this.theAuthor = theAuthor;
	}
	
	public Series getMySeries() {
		return mySeries;
	}
	
	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
	}
	
	@Override
	public String coverArt() {
		return "Method coverArt called from Novel";
	}
	
}