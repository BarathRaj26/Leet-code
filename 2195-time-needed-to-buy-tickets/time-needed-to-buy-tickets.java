class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sec=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                if(tickets[i]<=tickets[k]){
                    sec+=tickets[i];
                }
                else{
                    sec+=tickets[k];
                }
            }
            else{
                if(tickets[i]<tickets[k]){
                    sec+=tickets[i];
                }
                else{
                    sec+=tickets[k]-1;
                }
            }
        }
        return sec;
    }
}