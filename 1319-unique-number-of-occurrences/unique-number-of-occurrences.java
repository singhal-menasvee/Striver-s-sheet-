class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> occurences= new HashSet<>();
        for(Map.Entry<Integer,Integer> set: map.entrySet()){
            if(!occurences.contains(set.getValue())){
                occurences.add(set.getValue());
            }
            
            
        }
        return occurences.size()==map.size();
    }
}