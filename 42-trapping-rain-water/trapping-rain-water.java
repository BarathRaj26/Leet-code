class Solution {
    public int trap(int[] height) {
        int l=0,sum=0;
        int r=height.length-1;
        int lmax = height[l], rmax = height[r];
        while(l<r){
            if(lmax<rmax){
                sum+=lmax-height[l++];
                lmax=Math.max(height[l],lmax);
            }
            else{
                sum+=rmax-height[r--];
                 rmax=Math.max(height[r],rmax);
            }
        }
        return sum;
    }
}