package Old;

/**
 * ���ݽṹ
 */
public class Text4 {
    /**
     * ��ִ�е���int a = 0������ջ�п�����һ���ڴ棬��ַ�����裺AD8500�����ֵ����0
     *
     * ����swap������ִ��int i���֣���ջ�п���һ���ڴ棬��ַ��AD8600��ֵ���Ǵ�a���︴�ƹ�����ֵ������0��ִ��swap����
     * ��Ĵ��룬i = 6����i��ջ�е�ֵ�ĳ�6������i��ջ�е�ֵ����6
     * @param i
     */
    public static void swap(int i){
        i = 6;
        System.out.println("swap�����в���i��ֵ��"+i);
    }

    public static void main(String[] args) {
        int a = 0;
        swap(a);
        System.out.println("main������a��ֵ��"+a);
    }
}
