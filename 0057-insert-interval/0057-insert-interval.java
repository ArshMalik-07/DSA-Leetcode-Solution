class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res= new int[intervals.length+1][2];
        int index=0;
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res[index]=intervals[i];
            index++;
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res[index]=newInterval;
        index++;
        while(i<intervals.length){
            res[index]=intervals[i];
            index++;
            i++;
        }
        return Arrays.copyOf(res,index);
    }
}