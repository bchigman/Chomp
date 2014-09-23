/**
 * 
 * @author Ben Higman and Vaughan Coder
 * @version 0.1  Not even close
 * Class for constructing a game of Chomp
 *
 */

import java.util.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chomp{	
	private static int currentPlayer = 0;
	private int size;
	private ArrayList<AbstractCookie> cookies;
	private static JLabel turnLabel;

	/**
	 * Constructor for class
	 */
	public Chomp(){
		this.setSize(5);
	}
	
	/**
	 * Constructor for class
	 *@param size of board
	 */
	public Chomp(int size){
		this.setSize(size);
	}
	
	/**
	 * Display method handles adding components to frame.
	 */
	public void display(){
		JFrame frame = new JFrame("CHOMP!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel labelHolder = new JPanel();
		turnLabel = new JLabel("Player " + (currentPlayer+1)  + "'s turn.");
		JPanel gameHolder = new JPanel();
		gameHolder.setLayout(new GridLayout(size, size));
		
		for(AbstractCookie cookie : cookies){
			cookie.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e){
	            	//TERRIBLE TERRIBLE DOWNCASTING!
	            	AbstractCookie clickedCookie = (AbstractCookie) e.getSource();
	            	if (clickedCookie.getType() == "Cookie"){
	            		
	            		swapPlayer();
	            		clickedCookie.clickHandler();
	            		
	            		for(AbstractCookie cookieToBeEaten: cookies){
	            			if(cookieToBeEaten.getX() >= clickedCookie.getX() && cookieToBeEaten.getY() >= clickedCookie.getY()){
	            				cookieToBeEaten.clickHandler();
	            			}
	            		}
	            	}
	            	else if (clickedCookie.getType()== "Poison"){
	            		for(AbstractCookie cookieToBeEaten: cookies){
	            			if(cookieToBeEaten.getX() >= clickedCookie.getX() && cookieToBeEaten.getY() >= clickedCookie.getY()){
	            				cookieToBeEaten.clickHandler();
	            			}
	            		}
	            		gameOver();
	            		//frame.setVisible(false);
	            		//frame.dispose();
	            	}
	            }
	            });
			
			gameHolder.add(cookie);
			
		}
		
		
		labelHolder.add(turnLabel);
		
		frame.add(labelHolder, BorderLayout.PAGE_START);
		frame.add(gameHolder, BorderLayout.CENTER);
		frame.setMinimumSize(new Dimension(500, 500));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	/**
	 * Handles the creation of the arraylist of cookie jbuttons.
	 * 
	 * @return ArrayList an arraylist of the cookies in the game
	 */
	public ArrayList<AbstractCookie> populateCookies(){
		cookies = new  ArrayList<AbstractCookie>();
		
		for (int i = 0; i < this.getSize(); i++){
			for(int k = 0; k < this.getSize(); k++)
				if(i == 0 && k == 0){
					cookies.add(new PoisonCookie(i, k));
				}
				else{
					cookies.add(new Cookie(i, k));
				}
			
		}
		
		
		return cookies;
	}
	
	private void setSize(int size){
		this.size = size;
	}

	
	/**
	 * Gets the size of the board
	 * @return size of the board
	 */
	public int getSize(){
		return this.size;
	}
	
	private static void swapPlayer(){
		if (currentPlayer == 0){
			currentPlayer = 1;
		}
		else{
			currentPlayer = 0;
		}
		turnLabel.setText("Player " + (currentPlayer+1) + "'s turn.");
	}
	
	private static void gameOver(){
		swapPlayer();
		turnLabel.setText("Player " + (currentPlayer+1) + " loses! (Suck it Trebek!)");
		
	}
	

	/**
	 * Main method for playing chomp game
	 * @param args the args
	 *
	 */
	public static void main(String []args){
		Chomp chomp = new Chomp();
		chomp.populateCookies();
		//ArrayList<AbstractCookie> cookies = new ArrayList<AbstractCookie>();
		chomp.display();
	}

}