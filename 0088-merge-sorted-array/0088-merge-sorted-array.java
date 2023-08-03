class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int c =0 ; 
for(int i =m  ; i<n+m;i++){
nums1[i]=nums2[c];
c++;
}

for (int i =1 ;i<nums1.length;i++) {
			int temp = nums1[i];
			int j = i-1;
			while(j>=0 && nums1[j]>temp) {
				nums1[j+1]=nums1[j];
				j--;
			}
			nums1[j+1]=temp;
		}
	



    }
}