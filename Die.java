package oink;

import java.util.Random;

public class Die 
{
	int min = 1,max=6;
	Random rollObj = new Random();

   public int rollDie()
   {
	   int rollingDie = rollObj.nextInt(max)+1;
	   System.out.println(rollingDie);
	   return rollingDie;
   }
}
