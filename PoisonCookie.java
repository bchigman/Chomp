/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The PoisonCookie class is the state representation of the poison cookie,
 *  that when consumed, causes the eating player to lose.
 */

import java.awt.Color;

public class PoisonCookie extends AbstractCookie{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param xPosition int value of x-position of cookie
	 * @param yPosition int value of y-position of cookie
	 */
	public PoisonCookie(int xPosition, int yPosition){
		this.setXPos(xPosition);
		this.setYPos(yPosition);
		this.setType(2);
		this.setBackground(Color.RED);
	}
	
	/**
	 * Handles event when cookie is clicked. Ends game.
	 */
	public void clickHandler() {
		
	}
	
}