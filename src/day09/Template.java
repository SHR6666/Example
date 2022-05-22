package day09;

/**
 * ģ�����ģʽ
 */
public abstract class Template {
    public abstract void Code();
    public final void getTime(){
        long start = System.currentTimeMillis();
        Code();
        long end = System.currentTimeMillis();

        System.out.println("code����ִ�е�ʱ�䣺" + (end - start));
    }

    static class TextTmp extends Template{
        int k = 0;
        @Override
        public void Code() {
            for (double i = 0; i < 5000; i++) {
                k += 1;
            }
            System.out.println(k);
        }
    }
}
