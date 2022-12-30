package leetcode_demo;
/*

假如楼梯的长度为n  每次只能爬1步或者2步，问 有多少种爬法
 */
public class ClimbStairs {
    public static void main(String[] args) {
        final int i = climbStairs( 4);
        System.out.println(i);

    }

    public  static int climbStairs(int n){
        int pre=2;
        int prepre=1;
        int resout=0;
//
        if(n==1) return resout=1;
        if(n==2) return resout=2;
        if(n>=3){
            for(int i=3;i<=n;i++){
                resout=pre+prepre;
                prepre=pre;
                pre=resout;
            }
        }
        return resout;
    }

}


