//Given a sorted array, the task is to remove the duplicate elements from the array
class Solution {
    static int removeDublicates(int[] nums) {
    	int n = nums.length;
    	
    	if (n == 0 || n == 1) {
    		return n;
    	}
    	
    	int j = 0;
    	int[] temp = new int[n];
    	for(int i=0; i<n-1; i++) {
    		if(nums[i] != nums[i+1]) {
    			temp[j++] = nums[i];
    		}
    		
    	}
    	temp[j++] = nums[n-1];
		for(int i=0; i<j; i++) {
			nums[i] = temp[i];
		}
		return j;	
    }
    public static void main (String[] args) {
    	int arr[] = {1,1,2,3,3,3,4,4,4,4};
    	int m = removeDublicates(arr);
    	for (int i=0; i<m; i++) 
             System.out.print(arr[i]+" "); 
    }
}
