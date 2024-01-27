class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
/*
[[1,2,3],[3,2,1]]
accounts.length=2  accounts[0].length=3
i=0: sum=1+2+3=6 max=6
i=1: sum=3+2+1=6 max=6
return max
*/