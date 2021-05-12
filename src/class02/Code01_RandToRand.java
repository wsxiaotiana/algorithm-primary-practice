package class02;

/**
 * @description: 等概率到等概率算法
 * f方法可以等概率返回a到b，用f方法得到g方法等概率返回c到d,f方法不允许修改
 * @author: yanxiaotian
 * @create: 2021-05-12 15:33
 **/
public class Code01_RandToRand {

    /**
     * 例子1：从等概率返回1-5,得到等概率返回1-7
     */
    //等概率返回1-5
    public static int f(){
        return (int)(Math.random()*5+1);
    }

    //等概率返回0和1
    public static int a(){
        int a=0;
        do {
            a=f();
        }while(a==3);
        return a>3 ? 0:1;
    }

    //等概率返回0到6
    public static int b(){
        int b=0;
        do{
           b=(a()<<2)+(a()<<1)+(a()<<0);
        }while (b==7);
        return b;
    }

    //等概率返回1到7
    public static int g(){
        return b()+1;
    }


    public static void main(String[] args){
        int testTimes=10000000;
        int[] counts=new int[7];
        for(int i=0;i<testTimes;i++){
            int b=g();
            counts[b-1]++;
        }
        for(int i=0;i<counts.length;i++){
            System.out.println((double)counts[i]/testTimes);
        }
    }
}
