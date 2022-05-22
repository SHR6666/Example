package day09;

public interface BWMFactory {
    BWM productBWM();
}

/**
 * ʵ�־��峵�͵�����
 */
class BWM3Factory implements BWMFactory {
    @Override
    public BWM productBWM() {
        System.out.println("��������3ϵ��");
        return new BWM3();
    }
}
class BWM5Factory implements BWMFactory{
    @Override
    public BWM productBWM() {
        System.out.println("��������3ϵ��");
        return new BWM5();
    }
}
class BWM7Factory implements BWMFactory{
    @Override
    public BWM productBWM() {
        System.out.println("��������7ϵ��");
        return new BWM7();
    }
}
