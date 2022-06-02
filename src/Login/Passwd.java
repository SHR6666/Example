package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 设置JF窗体窗体上共有 8 个组件，4 个 JLabel
 * 标签分别命名为 lb1，lb2，lb3，lb4；2 个 JPasswordField 密码框分别命名为 pf1，pf2；1 个 JButton 命令按钮命名为 btn；1 个 JTextField 文本框命名为 tf。
 * 对两次输入的密码进行
 * 验证，如果正确，通过 lb4 显示“密码正确！！”，否则显示“密码错误！！！”。密码为123456
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
        super("密码验证");
        setLayout(new FlowLayout());
        lb1 = new JLabel("用户名：");
        lb2 = new JLabel("密码：");
        lb3 = new JLabel("确认密码：");
        lb4 = new JLabel("");
        pf1 = new JPasswordField(10);
        pf2 = new JPasswordField(10);
        btn = new JButton("确认");
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
                    lb4.setText("密码正确！！");
                } else {
                    lb4.setText("密码错误！！！");
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
