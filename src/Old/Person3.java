package Old;

public class Person3 {
    /**
     * ������ķ�ʽ�����ݿɱ�����Ĳ���
     * ���û�в�����һ��Ҫ����һ��������null
     * @param args
     */
    public void printInfo(String[] args){    //�����ܹ���ӡ����Ϣ������Դ�ڷ����Ĳ�����Ҳ�����βεĴ���
        //�������ڿ��ܸ��������ݲ�ͬ�Ĳ������������������£����ǲ�֪����Ҫ���������ݶ��ٸ��������������Ա����䡢Ҳ�п��������֤����ͼ�ͥסַ���ֻ��ŵȣ�
        for (int i = 0 ; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * ��java���е�...�ķ�ʽ�����ݿɱ�����Ĳ��������ֲ�����ʹ��ʱ�������ʹ�÷�ʽ��ͬ
     * ���û�в������Բ���
     * ����...���Դ���0��������βΣ��ɱ���βΣ�...���ֲ�����һ��Ҫ�ŵ����в��������
     * printInfo1(String s, int d,String... args)�����ӷ��ò����ķ�ʽ�ǶԵ�
     * printInfo1(String s, String... args, int d,)�������ò�����λ���ǲ��Ե�
     * printInfo1(String... args, String s, int d,)�������ò�����λ��Ҳ�ǲ��Ե�
     * @param args
     */
    public void printInfo1(String... args){
        for (int i = 0 ; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
