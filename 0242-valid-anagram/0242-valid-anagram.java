class Solution {
    static String StrSort(String a){
        char [] c = a.toCharArray();
        Arrays.sort(c);
        return new String(c);
        }
    public boolean isAnagram(String s, String t) {
    
    if(s.length() != t.length()){
        return false;
    }
       String s1 = StrSort(s);
       String s2 = StrSort(t);

       for(int i=0; i<=s1.length()-1; i++){
           if(s1.charAt(i)!=s2.charAt(i)){
               return false;
           }
       }
       return true;
    }
}