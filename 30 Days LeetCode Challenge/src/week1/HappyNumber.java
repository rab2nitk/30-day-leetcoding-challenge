class Solution {
    public int numSquareSum(int n){
        int sum = 0;
        while(n!=0){
            sum = sum + (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow =n;
        int fast = n;
        do{
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }while(slow!=fast);
        
        return (slow==1);
    }
}