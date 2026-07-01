class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
            for(int j=nums.length-1;j>index;j--){
                if(nums[j]>nums[index]){
                  int temp=nums[index];
                  nums[index]=nums[j];
                  nums[j]=temp;
                  break;
                }
            }
        }
        int left=index+1;
        int right=nums.length-1;
        while(left < right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        
    }
}