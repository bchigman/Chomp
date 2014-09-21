/**
 * 
 * @author Ben Higman and Vaughan Coder
 * @version 0.1
 * The class for handling the game play logic for Chomp
 *
 */

public class PlayChomp {

	private int currentPlayer = 0;
	
	public PlayChomp() {
		
	}
	
	public void swapPlayer(){
		if (this.currentPlayer == 0){
			this.setCurrentPlayer(1);
		}
		else{
			this.setCurrentPlayer(0);
		}
	}
	
	public void setCurrentPlayer(int player){
		this.currentPlayer = player;
	}
	
	public int getCurrentPlayer(){
		return this.currentPlayer;
	}
	
}
