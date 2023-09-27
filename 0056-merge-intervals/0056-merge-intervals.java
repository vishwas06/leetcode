class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
     int n = intervals.length;
        for(int i=1;i<intervals.length;i++){
		// checking  if the start of the current is <= end of previous
		// merging the interval and setting the previous one as -1
            if(intervals[i][0] <= intervals[i-1][1]){
                intervals[i][1] = Math.max(intervals[i-1][1],intervals[i][1]);
                intervals[i][0] = intervals[i-1][0];
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;n--;
            }
        }
        
        int[][] ans = new int[n][2];
        
        int i=0;
	
        for(int[] a : intervals){
		// including all the positive answers in the answer array
            if(a[0]!= -1){
                ans[i][0] = a[0];
                ans[i][1] = a[1];
                i++;
            }
        }
        
        return ans;
    }
}