package ca.ucalgary.ensf380;

/*
 * Anthology.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.0
 */

public class Anthology extends Fiction {
	
	private Story[] story;
	
	public String storyOrder() {
		return "Method storyOrder called from Anthology";
	}
	
	public Story[] getStories() {
		return story;
	}
	public void setStories(Story[] story) {
		this.story = story;
	}
	
	@Override
	public String coverArt() {
		return "Method coverArt called from Anthology";
	}
}

