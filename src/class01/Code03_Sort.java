package class01;

import java.util.Arrays;

/**
 * @description: 排序
 * @author: yanxiaotian
 * @create: 2021-05-06 17:17
 **/
public class Code03_Sort {

    public static void main(String[] args){
        int[] arr= new int[]{2,3,8,9,0,5,3,6};
        //selectionSort(arr);
        //bubbleSort(arr);
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int m,int n){
        arr[m]^=arr[n];
        arr[n]^=arr[m];
        arr[m]^=arr[n];
    }

    /**
     * 选择排序  每一轮选择出最小的数
     * 具体方法：第一次找到最小值并发到第一个位置，然后从第二个位置开始找到最小值放到第二个位置...
     * @param arr
     */
    public static void selectSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    /**
     * 冒泡排序  每一轮都将最大的数冒泡到最右面
     * 具体方法：从第一个开始，依次比较两个相邻的数，较大的数换到右面。第二轮的时候，冒泡到右面第2个数...
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int j=arr.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    /**
     * 插入排序  每次拿到一张新的扑克牌以后，将它插到合适的位置
     * 具体方法：拿到前两张牌先排好序，拿到第三张牌以后分别和前面的牌比较，直到放下为止
     * @param arr
     */
    public static void InsertSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>0;j--){
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
}
