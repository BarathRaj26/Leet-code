class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int prev=0;
        for(int curr=0;curr<points.length;curr++){
            if(points[curr][0]>points[prev][1]){
                count++;
                prev=curr;
            }
        }
        return count;
    }
}