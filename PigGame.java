package oink;
/*
 * @author Isaac Hutchinson
 * @version 0.0.1
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PigGame 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		try (BufferedReader br = new BufferedReader(new FileReader
				("/Users/isaachutchinson1/Documents/JavaProjects/Pig/src/oink/pigart.txt"))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
			       System.out.println(line);
			   }
			}
		String player1="",player2="";
		String p1HoldYN = "",p2HoldYN = "";
		int p1Age = 0,p2Age = 0;
		int tempScoreHold1 = 0,tempScoreHold2 = 0;
		int currentRoll1 = 0,currentRoll2 = 0;
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter Player 1 name:");
		player1 = scanObj.nextLine();
		System.out.println("Enter Player 1 age: (Players must be 21 years old)");
		p1Age = scanObj.nextInt();
		
		
		System.out.println("Enter Player 2 name:");
		player2 = scanObj.next();
		System.out.println("Enter Player 2 age: (Players must be 21 years old)");
		p2Age = scanObj.nextInt();
		
		Player p1 = new Player(player1, 1, p1Age, 0, false, false);
		Player p2 = new Player(player2, 2, p2Age, 0, false, false);
        Die d1 = new Die();		
		
		boolean gameState = true;
		while(gameState == true)
		{
			if(p1.turnEnd == false)
			{
				System.out.println("Player 1 turn Start:");
				p2.setTurn(true);;
			while(p1.turnEnd == false)
			{
				currentRoll1 = d1.rollDie();
				 if(currentRoll1 == 1){
					 p1.setTurn(true);
				     p2.setTurn(false);
				 }
				tempScoreHold1 += currentRoll1;
				p1.setScore(tempScoreHold1);
				if(p1.getScore()==50){
					p1.setWinner(true); //Just for Info print
					gameState = false;
					}
				
				System.out.println(p1);
				System.out.println("Do you want to hold? (y/n)");
				p1HoldYN = scanObj.next().toLowerCase();
				 if(p1HoldYN.equals("y") )
				 {
					// p1Hold = true;
					 p2.setTurn(false);
					 p1.setTurn(true);
				 }
				}
			}
			if(p2.turnEnd == false)
			{
				System.out.println("Player 2 turn Start:");
				p1.setTurn(true);
			 while(p2.turnEnd == false)
			 {
				currentRoll2 = d1.rollDie();
				tempScoreHold2 += currentRoll2;
				p2.setScore(tempScoreHold2);
				System.out.println(p2);
				System.out.println("Do you want to hold? (y/n)");
				p2HoldYN = scanObj.next().toLowerCase();
				 if(p2HoldYN.equals("y"))
				 {
					 p1.setTurn(false);
					 p2.setTurn(true);
				 }
				 if(currentRoll1 == 1)
					 p1.setTurn(false);
				     p2.setTurn(true);
				
				if(p2.getScore()==50){
					p2.setWinner(true); //Just for Info print
					gameState = false;
					}
			}
			}
			
		}
	}

}
