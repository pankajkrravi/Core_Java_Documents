package Assignment2;

public class DispOddEvennum {
	public int[] evenOdds(int[] values)
	   {
	      int[] evenOdds= new int[2];
	      int oddCount=0; 
	      int evenCount=0; 
	      for(int i=0; i<values.length; i++)
	
	         {
	             if(values[i]%2==1); 
	
	               oddCount++; 
	
	             if(values[i]%2==0); 
	
	                  evenCount++; 
	         }
	       values[0]=evenCount;
	
	       values[1]=oddCount;  
	
	       return evenOdds; 
	 }
}
