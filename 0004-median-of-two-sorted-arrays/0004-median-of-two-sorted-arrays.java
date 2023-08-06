class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
	  	 	int [] res=new int[nums1.length+nums2.length];
	    	int j =0 ;
	       int i = 0 ;
	       int c =0;
	       
	      
	      
	       while(i<nums1.length || j<nums2.length ) {
	    	   
	    	   if(j==nums2.length) {
	    		   res[c]=nums1[i];
	    		   i++;
	    		   c++;
	    	   }
	    	   else if(i==nums1.length) {
	    		   res[c]=nums2[j];
	    		   j++;
	    		   c++;
	    	   }
	    	   else  if(nums1[i]<=nums2[j] ) {
	    		   res[c]=nums1[i];
	    		   i++;
	    		   c++;
	    		   
	    		   }
	    	   else {
	    		   res[c]=nums2[j];
	    		   j++;
	    		   c++;
	    	   }
	       
	    	   }
	    	  
	       
	       
	       double median = 0.0;
	       if(res.length%2==0) {
	    	    median =(double)(res[res.length/2]+res[res.length/2-1])/2;
	       }else {
	    	   median = res[res.length/2];
	       }
	 
	
	System.out.println(Arrays.toString(res));
	       return median;
		    	   
    }
}