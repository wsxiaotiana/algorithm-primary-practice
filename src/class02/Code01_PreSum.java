package class02;

/**
 * @description: 前缀和
 * @author: yanxiaotian
 * @create: 2021-05-07 16:37
 **/
public class Code01_PreSum {

    public static class RangeSum1{
        private int[] arr;
        public RangeSum1(int[] array){
            arr=array;
        }
        public int rangeSum(int L,int R){
            int sum=0;
            for(int i=L;i<R;i++){
                sum+=arr[i];
            }
            return sum;
        }
    }

    public static class RangeSum2{
        private int[] preSum;

        public RangeSum2(int[] array){
            preSum[0]=array[0];
            for(int i=1;i<array.length;i++){
                preSum[i]=preSum[i-1]+array[i];
            }
        }

        public int ranSum(int L,int R){
            return L==0? preSum[R]:preSum[R]-preSum[L-1];
        }
    }
}
