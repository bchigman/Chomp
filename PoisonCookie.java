<<<<<<< HEAD
=======
/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The PoisonCookie class is the state representation of the poison cookie,
 *  that when consumed, causes the eating player to lose.
 */

import javax.swing.ImageIcon;

public class PoisonCookie extends AbstractCookie{
	
	private static final long serialVersionUID = 1L;
	private ImageIcon poisonIcon = new ImageIcon("poisonCookie.jpg");
	
	public PoisonCookie(){
		this.setType(2);
		this.setIcon(poisonIcon);
	}
	
	public void clickHandler() {
		
	}
	
}
>>>>>>> parent of 5c550b3... Added to the populate method and fixed toString problems
