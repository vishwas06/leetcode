class Solution {
    public int countPrimes(int n) {
        if(n<=1)
        return 0;
        boolean[] b = new boolean[n];
        Arrays.fill(b, true); 

        for(int i=2; i*i<n; i++){
            if(b[i]==true){
                for(int p=i*i; p<n; p+=i){
                    b[p]=false;
                }
            }
        }
        int count=0;
        for(int j=2; j<n; j++){
                if(b[j]==true){
                    count++;
                }
                }
        return count;
    }
}