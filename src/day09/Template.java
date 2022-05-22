package day09;

/**
 * 模板设计模式
 */
public abstract class Template {
    public abstract void Code();
    public final void getTime(){
        long start = System.currentTimeMillis();
        Code();
        long end = System.currentTimeMillis();

        System.out.println("code方法执行的时间：" + (end - start));
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
