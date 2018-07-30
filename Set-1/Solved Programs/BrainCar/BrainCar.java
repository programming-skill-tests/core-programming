package com.braincar;

import java.util.logging.Logger;

public class BrainCar {
	
	private static int eachconsecutiveCount=1;
	private static int consecutiveDifferentVar[]=new int[3];				
	private static int consecutiveRepeatCount=0;
	
	
	/**
	 * Checking BrainCarName
	 *
	 * @param name of the car
	 * @return OK or Not OK
	 */
	public static String checkBrainCarName(String name) {
		
		int len=name.length();
				
				
				/** The logger. */
			    Logger logger = Logger.getLogger(BrainCar.class.getName());
				
				if(name.charAt(0)!=name.charAt(len-1))
				{
					for(int i=1;i<name.length();i++)
					{
						
						getConsecutiveCharcterCount(i,name);
						
						if(consecutiveRepeatCount==3)
							break;
											
					}
				
					if(consecutiveRepeatCount==2)
					{
						consecutiveDifferentVar[consecutiveRepeatCount]=eachconsecutiveCount;
					}
					
				}
				if(consecutiveRepeatCount==2 && consecutiveDifferentVar[0] == consecutiveDifferentVar[1] && consecutiveDifferentVar[1] == consecutiveDifferentVar[2])
				{
					logger.info("OK");
					return "OK";
				}
				else
				{
					logger.info("Not OK");
					return "Not OK";
				}
				
			
    }
	
	public static  void getConsecutiveCharcterCount(int i, String name){
		
		if(name.charAt(i)==name.charAt(i-1))
		{
			eachconsecutiveCount++;
		}
		else
		{
			consecutiveDifferentVar[consecutiveRepeatCount]=eachconsecutiveCount;						
			eachconsecutiveCount=1;
			consecutiveRepeatCount++;
			
		}
	
	}
}

