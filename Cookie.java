/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The Cookie class is the representation of normal un-eaten cookies
 */


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;

public class Cookie extends AbstractCookie{

	private static final long serialVersionUID = 1L;
	private ImageIcon cookieIcon = new ImageIcon("images/cookie.jpg");
	
	/**
	 * Constructor
	 * @param xPosition int value of x-position of cookie
	 * @param yPosition int value of y-position of cookie
	 */
	public Cookie(int xPosition, int yPosition){
		this.setXPos(xPosition);
		this.setYPos(yPosition);
		this.setType(1);
		this.setIcon(cookieIcon);
		this.setBackground(Color.GREEN);
		this.setSize(new Dimension(100,100));
		this.setPreferredSize(new Dimension(100,100));
	}
	
	/**
	 * Handles when cookie is clicked or in eaten-zone
	 */
	public void clickHandler() {
		this.setBackground(Color.GRAY);
		this.setType(0);
	}
	
}