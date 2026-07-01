class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        int max=0;
        for(Map.Entry<Integer,Integer> set:freq.entrySet()){
            max= Math.max(max,set.getValue());
        }
        int count=0;
        for(Map.Entry<Integer,Integer> set:freq.entrySet()){
            if(set.getValue()==max){
                count+=max;
            }
        }
        return count;
    }
}