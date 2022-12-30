package leetcode_demo;
/*
求两数之和等于一个目标值，找出两个数的index


 */
public class SumofTwoNums {
    public static void main(String[] args) {
        int [] a={129,38,2,5,7,9};
        int b=12;
        final int[] ints = sumTwoNums( a, b );
        System.out.println(ints[0]+" "+ints[1]);

    }

    public static int[] sumTwoNums(int[] m,int target){
        // 假设如下的数组，求和为12的下标
//        int [] a={2,5,7,9};
//
        int[] result=new int[2];
        for(int i=0;i<m.length-1;i++){
            for(int j=i+1;j<m.length-1;j++){
                if(m[i]+m[j]==target){
                    result[0]=i;
                    result[1]=j;
                   return result;

                }

            }
        }
        return result;

    }

}
