class Solution {
    public int[] getConcatenation(int[] nums) {
        	int c =0 ;
	    	int ans []= new int [nums.length*2];
				int i = 0;
				int j =0 ; 
	    	while(true){
	    		if(c==nums.length) {
	    			i=0;
	    			c++;
	    		}
	    		else {
	    			ans[j]=nums[i];
	    			c++;
						i++;
						j++;
	    		}	System.out.println(c+" "+i);
					if(c==nums.length*2+1)
					return ans;
				
	    	}
	    	 
    }
}