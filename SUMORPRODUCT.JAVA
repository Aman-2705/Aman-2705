public class Solution {

	public static long sumOrProduct(int n, int q) {
        long sum = 0;
        long product = 1;
        long M = 1000000007;
		if(q==1){
            for(long i = 1;i<=n;i++){
                sum+=i;
            }
        }
        else{
            for(long i = 1;i<=n;i++){
                product=(product*i)%M;
            }
        }
        if(q==1){
            return sum;
        }
        return product;
	}
