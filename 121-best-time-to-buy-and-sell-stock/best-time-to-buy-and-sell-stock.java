class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
            minprice=Math.min(prices[i],minprice);
        }
        return maxprofit;

    }
}
/*
7,6,4,3,1
minprice=7 maxprofit=0
i=1 max 0,6-7  =0,-1   min 6,7 =6
i=2 0,4-6  =0,-2    4,6 =4
i=3 0,3-4  =0,-1    3,4 =3
i=4 0,1-3  =0,-2    1,3 =1
i=5<5 condition fails
return 0
*/