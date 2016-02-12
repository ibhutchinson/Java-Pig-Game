package oink;

public class Player 
{
  String name;
  int age;
  int whichPlayer;
  int score;
  boolean isWinner;
  boolean turnEnd;
  
  public Player(String _name,int _whichPlayer,int _age,int _score,boolean _isWinner,boolean _turnEnd)
  {
	  this.name = _name;
	  this.whichPlayer = _whichPlayer;
	  this.age = _age;
	  this.score = _score;
	  this.isWinner = _isWinner;
	  this.turnEnd = _turnEnd;
  }
  
  public void setScore(int updatedScore)
  {
	  int tempScore = 0;
	  tempScore += updatedScore;
	  this.score = tempScore;
  }
  
  public int getScore()
  {
	  return this.score;
  }
  public void setWinner(boolean gameState)
  {
	  this.isWinner = gameState;
  }
  public void setTurn(boolean isTurnOver)
  {
	  this.turnEnd = isTurnOver;
  }
  public String toString()
  {
	  String playerInfo = "Player Information \n"+
			               "Player: "+this.whichPlayer+"\n"
	  		             +"Player name: "+this.name+"      Age: "+this.age+
	  		              " Score: "+this.score+"           Winner: "+this.isWinner+
	  		              "   Turn Over: "+this.turnEnd;
                               ;
	  return playerInfo;
  }
}
