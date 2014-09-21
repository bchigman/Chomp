/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The EmptyCookie class is the representation of Cookies that have already been eaten
 */

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class EmptyCookie extends AbstractCookie{

	private static final long serialVersionUID = 1L;
	private ImageIcon emptyIcon = new ImageIcon("emptyCookie.jpg");
	
	public EmptyCookie(){
		this.setType(0);
		this.setIcon(emptyIcon);
	}
	
	public void clickHandler() {
		
	}

}
