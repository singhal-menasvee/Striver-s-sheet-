class Solution {
    public int countSubstrings(String s) {
        
        int count=0;
        for(int i=0;i<s.length();i++){
            String substring="";
            for(int j=i;j<s.length();j++){
                substring+=s.charAt(j);
                if(palindrome(substring)){
                    count++;
                }
                
            }
        }
        return count;

        
    }
    public boolean palindrome(String s){
        
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
        
    
    }
}