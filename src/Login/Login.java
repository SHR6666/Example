package Login;

import java.io.*;

/**
 *��ȡname.txt��password.txt�ļ����ж��Ƿ����shr��123456���û���Ϊshr������Ϊ123456���������û��������룬����û�����������ȷ���������¼�ɹ������������¼ʧ��
 */
public class Login {
    public static void main(String[] args) throws Exception {
            Login.testLogin();
    }

    public static void testLogin(){
        try {
            FileReader fr = new FileReader("D:\\JavaProject\\untitled\\src\\Login\\name.txt");
            BufferedReader br = new BufferedReader(fr);
            String name = br.readLine();
            br.close();
            fr.close();

            FileReader fr1 = new FileReader("D:\\JavaProject\\untitled\\src\\Login\\password.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            String password = br1.readLine();
            br1.close();
            fr1.close();

            System.out.println("�������û�����");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br2 = new BufferedReader(isr);
            String name1 = br2.readLine();
            System.out.println("���������룺");
            String password1 = br2.readLine();

            if (name.equals(name1) && password.equals(password1)){
                System.out.println("��¼�ɹ�");
            }else{
                System.out.println("��¼ʧ��");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
