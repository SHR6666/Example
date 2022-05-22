/**
 * 数据结构
 */
public class Text4 {
    /**
     * 先执行的是int a = 0；，在栈中开辟了一块内存，地址就是设：AD8500，存的值就是0
     *
     * 调用swap方法，执行int i部分，在栈中开辟一块内存，地址是AD8600，值就是从a那里复制过来的值，就是0，执行swap方法
     * 里的代码，i = 6，把i在栈中的值改成6，最终i在栈中的值就是6
     * @param i
     */
    public static void swap(int i){
        i = 6;
        System.out.println("swap方法中参数i的值："+i);
    }

    public static void main(String[] args) {
        int a = 0;
        swap(a);
        System.out.println("main方法中a的值："+a);
    }
}
