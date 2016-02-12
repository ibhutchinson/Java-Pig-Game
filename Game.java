package oink;

import java.util.Scanner;

public class Game 
{
  Scanner scan = new Scanner(System.in);
  Player p1;
  Player p2;
  Die    d1;
  
  public Game(Player _p1,Player _p2,Die _d1)
  {
	 this.p1 = _p1;
	 this.p2 = _p2;
	 this.d1 = _d1;
  }
  public boolean isGameOver(boolean isGame)
  {
	  boolean temp = false;
	  temp = isGame;
	  return isGame;
  }
  
  public void P1Turn()
  {
	boolean p1TurnOver = false;  
	boolean p1TurnState = true;
	int startTurnScore = p1.getScore();
	int tempDieHold = 0;
	String hold = "";
    while(p1TurnState != false)
	{
      System.out.println("Do you want to Hold? (Y/N)");
      hold = scan.next().toLowerCase();
     if(hold.equals("n"))
     {	 
	  int p1Roll = d1.rollDie();
       if (p1Roll == 1)
       {
    	  p1.setScore(startTurnScore);
    	  p1TurnState = true;
    	  p1TurnOver = false;
       }else{
	   tempDieHold += p1Roll;
	   p1.setScore(tempDieHold);
	   if(p1.getScore()==50)
	   {
		   this.isGameOver(true);
	   }
       }
     }else if(hold.equals("y")){
   	  p1TurnState = true;
   	  p1TurnOver = false;
     }
	}  
  }
  public void P2Turn()
  {
		boolean p2TurnState = true;
		int startTurnScore2 = p2.getScore();
		int tempDieHold2 = 0;
		String hold2 = "";
	    while(p2TurnState != false)
		{
	      System.out.println("Do you want to Hold? (Y/N)");
	      hold2 = scan.next().toLowerCase();
	     if(hold2.equals("n"))
	     {	 
		  int p2Roll = d1.rollDie();
	       if (p2Roll == 1)
	       {
	    	  p1.setScore(startTurnScore2);
	    	  p2TurnState = true;

	       }else{
	    	   tempDieHold2 += p2Roll;
	    	   p2.setScore(tempDieHold2);
	    	   if(p2.getScore()==50)
	    	   {
	    		   this.isGameOver(true);
	    	   }
	       }
	     }else if(hold2.equals("y")){
	   	  p2TurnState = true;
	     }
		}
  }
  
}
