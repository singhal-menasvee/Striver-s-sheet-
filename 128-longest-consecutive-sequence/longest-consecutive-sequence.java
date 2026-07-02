class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set= new HashSet<>();
        
        int longest=1;
        for(int num:nums){
            set.add(num);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;



            
            while(set.contains(x+1)){
                count+=1;
                x+=1;
            }
            longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}