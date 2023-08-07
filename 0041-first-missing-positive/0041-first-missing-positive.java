class Solution {
    public int firstMissingPositive(int[] nums) {
        	int []temp = new int[nums.length];
	    	int []arr = new int[nums.length];
	    	Arrays.sort(nums);
	    	System.out.println(Arrays.toString(nums));
	    
	    	for(int i = 0,c = 0  ; i<nums.length;i++) {
	    		if(nums[i]>0) {
	    			arr[c]=nums[i];
	    			c++;
	    		}
	    			
	    	}
	    	
	    	 int j = 0;
	         for (int i = 0; i < arr.length - 1; i++)
	              
	             if (arr[i] != arr[i + 1])
	                 temp[j++] = arr[i];
	  
	         temp[j++] = arr[arr.length- 1];
	    
	    	
	    	System.out.println(Arrays.toString(temp));
	    	int k = 0 ; int a=1;
	    	while (true) {
	    		if(k==temp.length || (temp[k]!= a) ) {
	    			return a;
	    		}
					k++;
					a++;
	    		
	    		
	    		
	    		
	    	}
	        
    }
}