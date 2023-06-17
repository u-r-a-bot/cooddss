import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        double totalsteps=0;
        long twocount=0;
        if(n%2 ==0){
            for (long i = 2; i < n; i+=2) {
                long temp = n;
                twocount++;
                temp = temp - i;
                temp += twocount;
                totalsteps += combination(temp,twocount);

            }
            return (int)totalsteps+2;
        }
        else{
            for (long i = 2; i < n; i+=2) {
                long temp = n;
                twocount++;
                temp = temp - i;
                temp += twocount;
                totalsteps += combination(temp,twocount);

            }
            return (int)totalsteps+1;
        }

        //1+1+1+1+1 1+1+1+2 1+1+2+1 1+2+1+1 2+1+1+1 2+2+1 2+1+2 1+2+2
    }
    public double combination(long n,long r){
        double nfact=1;
        for(int i=(int)n;i>=1;i--){
            nfact *= i;
        }
        double rfact=1;
        for(int i=(int)r;i>=1;i--){
            rfact *=i;
        }
        double n_rfact=1;
        for (int i = (int)(n-r); i >=1 ; i--) {
            n_rfact*=i;
        }
        return nfact/(rfact*n_rfact);
    }

}
public class stairclimb {
    public static void main(String[] args) {
        Solution a = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a.climbStairs(n));
    }
}
