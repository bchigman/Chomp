<<<<<<< HEAD
=======
/**
 * 
 * @author Ben Higman and Vaughan Coder
 * @version 0.1  Not even close
 * Class for constructing a game of Chomp
 *
 */

import java.util.*;

public class Chomp {
	
	private int size;
	private ArrayList<ArrayList<AbstractCookie>> cookies;
	
	public Chomp(){
		this.setSize(5);
	}
	
	public Chomp(int size){
		this.setSize(size);
	}
	
	public void display(){
		
	}
	
	public ArrayList<ArrayList<AbstractCookie>> populateCookies(ArrayList<ArrayList<AbstractCookie>> cookies){
		ArrayList<AbstractCookie> cookieList = new ArrayList<AbstractCookie>();
		cookieList.add(new PoisonCookie());
		cookies.add(cookieList);
		
		return cookies;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public static void main(String []args){
		Chomp chomp = new Chomp();
		ArrayList<ArrayList<AbstractCookie>> cookies = new ArrayList<ArrayList<AbstractCookie>>();
		System.out.println("The array"+ chomp.populateCookies(cookies));
	}

}
>>>>>>> parent of 5c550b3... Added to the populate method and fixed toString problems
