package clientInterface;

import commonEntities.Dice;
import commonEntities.GameSettings;
import commonEntities.Pawn;
import commonEntities.Player;
import java.awt.Color;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nikolas
 */
public class Main {


/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws IOException, ClassNotFoundException {
    Scanner reader = new Scanner(System.in);
    Player pl;
    GameSettings gms;
    String[] userInfo;
    int resp = 0;
    //Connection stuff
    ServerInterface srv = new ServerInterface("localhost",80);
    System.out.print("Enter player name: ");
    userInfo = reader.nextLine().split(" ");
    pl = new Player(userInfo[0],Integer.valueOf(userInfo[1]));
    
    //Initialize with server
    //Game Master(getGmFlag) Sets the GameSetting (gms)
    //If gmFlag==True this is a new game and needs a GameSetting(gms)
    if(srv.getGmFlag())
    {
	System.out.print("Enter number of players and pawns: ");
	userInfo = reader.nextLine().split(" ");
	gms = new GameSettings(Integer.valueOf(userInfo[0]), true,
		Integer.valueOf(userInfo[1]));
	//Update server with plauyer and gameSetting info, new game
	srv.init(pl,gms);
    }
    else
    {
	//Updates the only with the player's info, game already exists
	srv.init(pl);
    }
    //Sync player list and game settings
    srv.sync();
    System.out.println(srv.getPlayers().toString());
    
    //Game is ready to be played
    //Sample 10 turn gameplay
    int counter = 0;
    while(resp != -1){
	//WaitForTurn waits for TURN(1), UPDATE(0) or END(-1) commands
	//from server
	resp = srv.waitForTurn();
	if(resp==0)
	    System.out.println(srv.getDice()+"\n"+srv.getPawn());
	else if(resp==1)
	    if(counter == 10){
		srv.endGame();
		break;
	    }else
		//Updates the server with Dice and Pawn
		srv.updatePawn(new Dice(2,5), new Pawn(new Color(0,0,0), "taz", 33));
	else if(resp ==-1)
	    //Server told the client that the game has ended
	    System.out.println("Game Ended");
	else
	    srv.endGame();
	counter++ ;
    }
}

}
