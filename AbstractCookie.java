/**
 * @author Ben Higman and Vaughan Coder
 * @version 0.1 the first version
 * The AbstractCookie class is the base state for all cookies
 */

import javax.swing.*;

public abstract class AbstractCookie extends JButton{

	private static final long serialVersionUID = 1L;
	private int xPosition;
	private int yPosition;
	private String type;
	
	public abstract void clickHandler();
	
	public String toString(){
		return ""+this.getType()+" cookie at X:"+this.getX()+", Y:"+this.getY()+"\n";
	}
	
	/**
	 * Sets the type of cookie
	 * @param type of cookie
	 */
	public void setType(int type){
		switch(type){
			case 1: this.type = "Cookie";
				break;
			case 2: this.type = "Poison";
				break;
			default: this.type = "Empty";
		}
	}
	
	/**
	 * Gets the type of cookie 
	 * @return String type of cookie
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 * Sets the x-position of cookie
	 * @param x-value
	 */
	public void setX(int x){
		this.xPosition = x;
	}
	
	/**
	 * Gets the x-position of cookie
	 * @return int x-value
	 */
	public int getX(){
		return this.xPosition;
	}
	
	/**
	 * Sets the y-position of cookie
	 * @param y-value
	 */	
	public void setY(int y){
		this.yPosition = y;
	}
	
	/**
	 * Gets the y-position of cookie
	 * @return int y-value
	 */
	public int getY(){
		return this.yPosition;
	}

}