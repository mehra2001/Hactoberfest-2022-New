class Solution {
    public int fib(int n) {
        int fibo=0;
        if(n==0||n==1)
        {
            fibo= n;
        }
        else if(n>1)
        {
            fibo=fib(n-1)+fib(n-2);
        }
        return fibo;
    }
}
