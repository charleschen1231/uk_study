package data_structure.algorithms.cn;



public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={27,45,68,168,32,8,256,2,37};
        int arr1[]={27,45,68,168,32,8,256,2,37};
        bubbleSort( arr );
        for (int a:arr
             ) {
            System.out.print(a+"\t");
        }

        selectSort( arr1 );
        System.out.println("\t");
        for (int b:arr1
             ) {
            System.out.print(b+"\t");
        }
    }
    public static void bubbleSort(int[] arr){
//        int arr1[]={27,45,68,168,32,8,256,2,37};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // 插入排序
    public static void selectSort(int[] arr){
//        int arr1[]={27,45,68,168,32,8,256,2,37};
        int temp=0;
        for(int i=0;i<8;i++){
            int max_index=i;
            for(int j=i;j<arr.length;j++){
                // 如果j 大于i  那么久标记j
                if(arr[max_index]<arr[j]){
                    max_index=j;
                }
            }
            if(max_index!=i){
                temp=arr[max_index];
                arr[max_index]=arr[i];
                arr[i]=temp;

            }
        }

    }
}
