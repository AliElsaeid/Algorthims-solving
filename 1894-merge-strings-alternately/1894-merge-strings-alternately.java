class Solution {
    public String mergeAlternately(String word1, String word2) {
        	String res ="";
	    	   int j =0 ;
		       int i = 0 ;
		       int c =0;
		       
		       while(i<word1.length() || j<word2.length() ) {
		    	   if(j==word2.length()) {
		    		   res+=word1.charAt(i);
		    		   i++;
		    		   c++;
		    	   }else if(i==word1.length()) {
		    		   res+=word2.charAt(j);
		    		   j++;
		    		   c++;
		    	   }
		    	   else if(i<=j) {
		    		   res+=word1.charAt(i);
		    		   i++;
		    		   c++;
		    	   }
		    	   else if(i>=j) {
		    		   res+=word2.charAt(j);
		    		   j++;
		    		   c++;
		    	   }
		    	   
		       }
		       
		       return res;
    }
}