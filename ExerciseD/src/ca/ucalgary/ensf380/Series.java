package ca.ucalgary.ensf380;

/*
 * Series.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.0
 */

public class Series {
	private String seriesName;
	
	
	public String theme() {
		return "Method theme called from Series";
	}
	
	public String getSeriesName() {
		return seriesName;
	}
	
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	
}

