class Solution {
    public int[] twoSum(int[] nums, int target) {
   ArrayList<Integer> t = new ArrayList<Integer>();
        
   for(int i = 0; i<nums.length;i++){


    for(int  j = 0 ; j < nums.length;j++){
    if(i!=j){
        if(nums[i]+nums[j]==target){
            t.add(i);
            t.add(j);
            break;
            
            
        }
        
    }

    }
       if(t.size()!=0)
           break;
   }
    int res[]=new int [t.size()];    
        
        for(int i=0;i<t.size();i++)
            res[i]=t.get(i);

    return res;    

        
    }
}