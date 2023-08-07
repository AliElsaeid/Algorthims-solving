class Solution {
    public int[] plusOne(int[] digits) {
	String s ="";
	    	for(int l = 0 ;l<digits.length;l++)
	    		s+=digits[l];
	    	
	    	Float o=Float.parseFloat(s)+1;
	    	
			s=""+o;
	    
			//System.out.println();	
     	int res[]=new int [digits.length+1];
	    if(digits[digits.length-1]!=9) {
	    	digits[digits.length-1]+=1;
	    	
	    	return digits;
	    	
	    
	    }else if((o>Float.MAX_VALUE || s.length()-2>digits.length)&& digits[digits.length-1]==9){
	    	for(int  j = digits.length-1 ,i=res.length-1; j>=0;j--,i--) {
	    		res[i]=digits[j];
	    	}
	    	System.out.println(s);	
	    	  int i =res.length-1;
	    	 
	    System.out.println(Arrays.toString(res)); 
	    	  while(i>=0) {
	    		  if(res[i]==9) {
							res[i]=0;
							i--;
	    		  }else{
							break;
						}
	    	
	    	  }
					res[i]+=1;
					return res;
    }else{

			  int i =digits.length-1;
	    	 
	    
	    	  while(i>0) {
	    		  if(digits[i]==9) {
							digits[i]=0;
							i--;
	    		  }else{
							break;
						}
	    	
	    	  }
					digits[i]+=1;
					return digits;




		}
	    	    
		}
		}
