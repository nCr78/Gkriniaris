package gkriniaris;

import commonEntities.Dice;
import commonEntities.GameSettings;
import commonEntities.Pawn;
import commonEntities.Player;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author Nikolas
 */
public class GameKeeper {
    private GameSettings gms;
    private ArrayList<Player> ppl;
    private Player me;
    private Pawn pwn;
    private HashMap<Integer,PriorityQueue<Pawn>> squares;
    
    public GameKeeper(Player me, ArrayList<Player> ppl,GameSettings gms){
	this.gms = gms;
	this.me = me;
	this.ppl = ppl;
	this.squares = new HashMap<>();
	for(int x = 0; x < gms.getPlayers(); x++){
	    this.squares.put(-1, new PriorityQueue<Pawn>());
	    for(int y = 0; y < gms.getNumberPawns(); y++){		
		this.squares.get(-1).add(new Pawn(
			ppl.get(x).getColor(),
			ppl.get(x).getName(),
			-1 ));
	    }
	}	
    }
    
    public void movePawn(Pawn p){
	squares.get(p.getPrevPosition()).remove();
	squares.get(p.getPosition()).add(p);
    }
    
    public boolean playMove(Pawn p , Dice d){
	if(d.getDie1()==5 && p.getPosition()==-1){
	    p.setPrevPosition(p.getPosition());
	    switch(p.getColor()){
		case 0:
		    break;
		case 1:
		    break;
	    }
	    movePawn(p);
	    return true;
	}else
	    return false;
    }
}