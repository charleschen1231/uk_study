package leetcode_demo;
/*

给定一个数组，数组中有0，要求把0移到数组的最后面，并且前面的数组要排序。并且不能copy其他的数组

 */

public class MoveZeronEnd {
    public static void main(String[] args) {

    }

    public static int[] moveZeroEnd(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]<=arr[j]){
                    arr[i]=temp;
                    temp=arr[j];

                }
            }
        }

        return arr;
    }
}
