class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
	    	int cols=matrix[0].length;
	      int i =0 ; int j =0;
	      int c=0;
	      int counter =0;
	    	while(true && counter<rows*cols) {
	    		if(matrix[i][j]==target)
	    			return true;
	    		else {
	    			j++;
	    			c++;
	    			if(c==cols) {
	    				i++;
	    				j=0;
	    				c=0;
	    			}
	    			counter++;
	    		
	    			
	    		}
	    		
	    		
	    		
	    	}
	    	
	    	
	    	return false;
    }
}