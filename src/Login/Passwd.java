package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ����JF���崰���Ϲ��� 8 �������4 �� JLabel
 * ��ǩ�ֱ�����Ϊ lb1��lb2��lb3��lb4��2 �� JPasswordField �����ֱ�����Ϊ pf1��pf2��1 �� JButton ���ť����Ϊ btn��1 �� JTextField �ı�������Ϊ tf��
 * ������������������
 * ��֤�������ȷ��ͨ�� lb4 ��ʾ��������ȷ��������������ʾ��������󣡣�����������Ϊ123456
 */
public class Passwd extends JFrame {
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JPasswordField pf1;
    private JPasswordField pf2;
    private JButton btn;
    private JTextField tf;


    public Passwd() {
        super("������֤");
        setLayout(new FlowLayout());
        lb1 = new JLabel("�û�����");
        lb2 = new JLabel("���룺");
        lb3 = new JLabel("ȷ�����룺");
        lb4 = new JLabel("");
        pf1 = new JPasswordField(10);
        pf2 = new JPasswordField(10);
        btn = new JButton("ȷ��");
        tf = new JTextField(10);
        add(lb1);
        add(pf1);
        add(lb2);
        add(pf2);
        add(lb3);
        add(tf);
        add(btn);
        add(lb4);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pwd = new String(pf1.getPassword());
                String pwd2 = new String(pf2.getPassword());
                if (pwd.equals(pwd2)) {
                    lb4.setText("������ȷ����");
                } else {
                    lb4.setText("������󣡣���");
                }
            }
        });
    }

    public void setPassword(String s) {
        pf1.setText(s);
    }

    public String getPassword() {
        return new String(pf1.getPassword());
    }
}
