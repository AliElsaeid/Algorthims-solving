class Solution {
    public int[] singleNumber(int[] nums) {
        int count =0;
        int index =0;
        int c =0;
        int temp []= new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            count = 0;
            for(int j =0 ;j<nums.length;j++){
                
               if(i!=j){
                if(nums[i]==nums[j]){
                System.out.println(nums[i]);
                count++;
                }
               }
                
            }
            if(count==0){
                temp[index]=nums[i];
                index++;
                c++;
                System.out.println(count);
            }
            
        }
        
        System.out.println(Arrays.toString(temp));
        
    int res []= new int[c];
        
    for(int i =0 ;i<c;i++){
      res[i]=temp[i];
    }    

        
        
        return res; 
    }
}
   
