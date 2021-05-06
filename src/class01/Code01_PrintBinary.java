package class01;

/**
 * @description: 打印int的二进制数
 * 如 10的二级制数为00000000000000000000000000001010
 * @author: yanxiaotian
 * @create: 2021-05-06 09:47
 **/
public class Code01_PrintBinary {

    public static void main(String[] args){
        int num =10;
        printBinary(num);
        System.out.println("--------------------------------");
        System.out.println(~num+1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println("--------------------------------");
        printBinary(1^1);
        printBinary(1^0);
        System.out.println("--------------------------------");
        printBinary(-1>>1);
        printBinary(-1>>>1);
    }

    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}
