package com.braincar;

public class BrainCar {
	public static String checkBrainCarName(String s) {
        
        //String s="aabbcc";
				int count=1;
				int diff[]=new int[3];				
				int c=0;
				int len=s.length();
				if(s.charAt(0)!=s.charAt(len-1))
				{
					for(int i=1;i<s.length();i++)
					{
						
						
						if(s.charAt(i)==s.charAt(i-1))
						{
							count++;
						}
						else
						{
							diff[c]=count;						
							count=1;
							c++;
							
						}
						if(c==3)
							break;
											
					}
				
					if(c==2)
					{
						diff[c]=count;
					}
					//System.out.println(c+" "+diff[0]+" "+diff[1]+" "+diff[2]);
				}
				if(c==2&&diff[0]==diff[1]&&diff[1]==diff[2])
				{
					System.out.println("OK");
					return "OK";
				}
				else
				{
					System.out.println("Not OK");
					return "Not OK";
				}
    }
}

