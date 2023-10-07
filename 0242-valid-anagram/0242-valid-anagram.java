class Solution {
    
     
    public boolean isAnagram(String s, String t) {
    
    if(s.length() != t.length()){
        return false;
    }

    int[] res= new int[26];

    for(int i=0; i<=s.length()-1; i++){
        res[s.charAt(i)-'a']++;
    }

    for(int j=0; j<=t.length()-1; j++){
         res[t.charAt(j)-'a']--;
    }

       for(int i=0; i<res.length; i++){
           if(res[i]!=0){
               return false;
           }
       }
       return true;
    }
}