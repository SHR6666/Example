package day09;

/**
 * �����Ĳ�Ʒ�ӿ�
 */
public interface BWM {
    //��Ʒ��Ϣ����
    //���ķ�����ʽ
    void showInfo();
}

class BWM3 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("����Ǳ���3����");
    }
}

class BWM5 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("����Ǳ���5����");
    }
}

class BWM7 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("����Ǳ���7����");
    }
}
