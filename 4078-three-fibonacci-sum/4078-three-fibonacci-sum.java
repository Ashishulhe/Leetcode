class Solution {
    public boolean threeFibonacciSum(int n) {
        //
    int sum=0;
      int a=0;
      int b=1;
      int c=1;
      if(a+b+c == n) return true;
        while(sum<n){
            c = b+c;
            int temp1 = b;
            b = a+b;
            a = temp1;
            if(a+b+c == n) return true;
            if(a+b+c > n) break;
        }
        return false;
    }
}