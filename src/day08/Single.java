package day08;

/**
 * ����ʽ�ĵ�����
 */
public class Single {
//    public Single(){
//        //���蹹����Ҫִ��һǧ�д���Ҫռ�ô�����Դ����ʱ��
//        //ÿ��new Singleһ������Ҫʮ���ӣ�����1000�д���
//        //������������ʺϵ���ģʽ��ֻnewһ�ζ���֮���һֱʹ���������
//    }

    //˽�еĹ���,���췽��˽�л��������������˾Ͳ���ֱ����new����������
    private Single() {

    }
    //ʵ��һ����̬��Single�ܷ񱻵���
    //˽�е�Single���͵������
    private static Single single = new Single();   //��������ͷ˽�е�Single��
    public static Single getInstance(){
        return single;
    }
}
