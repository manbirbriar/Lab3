package ca.ucalgary.ensf380;

/*
 * Fiction.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.0
 */

public abstract class Fiction extends Paperback{
	public abstract String coverArt();;
	
	public String genre() {
		return "Method genre called from Fiction";
	};
}
