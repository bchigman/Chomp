/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The Cookie class is the representation of normal un-eaten cookies
 */

import javax.swing.ImageIcon;

public class Cookie extends AbstractCookie{

	private static final long serialVersionUID = 1L;
	private ImageIcon cookieIcon = new ImageIcon("cookie.jpg");
	
	public Cookie(){
		this.setType(1);
		this.setIcon(cookieIcon);
	}
	
	public void clickHandler() {
		
	}
	
}
