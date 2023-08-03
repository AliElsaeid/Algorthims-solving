class Solution {
    public int majorityElement(int[] nums) {
          int majorityi = 0 ;
	        int majorc=0;
	      
	        for(int i =0;i<nums.length;i++) {
	        	  int counter=0;
	        	for(int j =0 ;j<nums.length;j++) {
	        		if(nums[i]==nums[j])
	        			counter++;
	        	}
	        	
	        	if(majorc<counter) {
	        		majorc=counter;
	        		majorityi=i;
	        	}
	        	
	        
	        	
	        }	return nums[majorityi]; 
    }
}