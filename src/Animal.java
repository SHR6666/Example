public class Animal {
    String name; //���������
    int eve;//�۾��ĸ���
    int legs; //������

    /**
     * �������Ե�ʳ��param foodʳ��
     */
    public void eat(String food) {    //(String food)���βΣ�����з�������,�������βο����ж��������֮���ö��ŷָ�

        System.out.println("���ֶ����ʳ����:" + food);
    }

    /**
     * ������ƶ���ʽ
     * param moveType�ƶ���ʽ
     */
    public void move(String moveType) {
        int i = 0;  //����з����ֲ�����
        System.out.println("���ֶ�����ƶ���ʽ��:" + moveType);
    }
}
