package com.problems;

public class KattapaReadyForBattle {

    public static String isReadForBattle(int n,int[] nums){
    	
       int evencount=0,oddcount=0;
       
        for(int i=0;i < n; i++){
        	
            if(nums[i]%2==0){
            	
                evencount++;
                
            }else{
            	
                oddcount++;
                
            }
        }
        if(evencount > oddcount){
        	
            return "READY FOR BATTLE";
            
        }
        else{
        	
            return "NOT READY";
            
        }
        
    }
}

