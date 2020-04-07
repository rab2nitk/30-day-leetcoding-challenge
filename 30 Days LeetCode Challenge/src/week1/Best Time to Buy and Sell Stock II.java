class Solution {
    public int maxProfit(int[] prices) {
        int base = -1;
        int sum = 0;
        int end = -1;
        int i = 0;
        int flag = 0;
        if(prices.length == 0){
            return 0;
        }
        while(i<prices.length-1){
            
            if(prices[i]<prices[i+1]){
                i++;    
                if(base == -1){
                    base = i-1;
                }
            }else{
                if(flag==0){
                    flag = 1;
                }
                
                end = i;
                if(base!=-1){
                   sum = sum + (prices[end]-prices[base]);
                   base = -1;
                }
                i++;
            }
        }
        if(end<=i && base!=-1){
            sum = sum + (prices[i]-prices[base]);
        }
        if(flag==0){
            sum = prices[prices.length-1]-prices[0];
            
        }
        System.out.println("sum="+sum);
        return sum;
    }
}