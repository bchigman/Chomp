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
		return ""+this.getType()+" cookie at X:"+this.getX()+", Y:"+this.getY();
	}
	
	public void setType(int type){
		switch(type){
			case 1: this.type = "Cookie";
				break;
			case 2: this.type = "Poison";
				break;
			default: this.type = "Empty";
		}
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setX(int x){
		this.xPosition = x;
	}
	
	public int getX(){
		return this.xPosition;
	}
	
	public void setY(int y){
		this.yPosition = y;
	}
	
	public int getY(){
		return this.yPosition;
	}

}
