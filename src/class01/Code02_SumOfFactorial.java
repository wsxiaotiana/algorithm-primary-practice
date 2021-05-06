package class01;

/**
 * @description: 求阶乘之和 如1!+2!+3!+4!...
 * @author: yanxiaotian
 * @create: 2021-05-06 10:22
 **/
public class Code02_SumOfFactorial {

    public static void main (String[] args){
        int num=20;
        long start =System.currentTimeMillis();
        System.out.println(getFactorialSum(num));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        long end2=System.currentTimeMillis();
        System.out.println(getFactorialSumUpdate(num));
        System.out.println(end2-end);
        System.out.println(getFactorialSumUpdate2(num));
    }

    public static long getFactorial(int num){
        if(num<0||num==1||num==2){
            return num;
        }
        int result=1;
        for(int i=num;i>0;i--){
            result*=i;
        }
        return result;
    }

    public static long getFactorialUpdate(int num){
        if(num<0||num==1||num==2){
            return num;
        }
        return num*(getFactorialUpdate(num-1));
    }

    public static long getFactorialSum(int num){
        int result=0;
        for(int i=1; i<=num; i++){
            result+=getFactorial(i);
        }
        return result;
    }

    public static  long getFactorialSumUpdate(int num){
        int result=0;
        for(int i=1; i<=num; i++){
            result+=getFactorialUpdate(i);
        }
        return result;
    }

    public static long getFactorialSumUpdate2(int num){
        int result=0;
        int cursor=1;
        for(int i=1; i<=num; i++){
            cursor=cursor*i;
            result+=cursor;
        }
        return result;
    }
}
