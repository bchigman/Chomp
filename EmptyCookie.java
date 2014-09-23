/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The EmptyCookie class is the representation of Cookies that have already been eaten
 */


import java.awt.Color;

import javax.swing.ImageIcon;


public class EmptyCookie extends AbstractCookie{

	private static final long serialVersionUID = 1L;
	private ImageIcon emptyIcon = new ImageIcon(EmptyCookie.class.getResource("images/emptyCookie.jpg"));
	
	/**
	 * Constructor
	 */
	public EmptyCookie(){
		this.setType(0);
		this.setIcon(emptyIcon);
		this.setBackground(Color.GRAY);
	}
	
	/**
	 * Abstract method that is implemented. No functionality yet.
	 */
	public void clickHandler() {
		}

}