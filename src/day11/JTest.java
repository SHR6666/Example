package day11;

import javax.swing.*;

public class JTest extends JFrame {
    public void CreateJFrame() {
        JFrame jf = new JFrame();
        JLabel jl = new JLabel("Hello World");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jf.setTitle("JFrame");
        jf.setSize(400, 400);
        jf.setLocation(200, 200);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        JTest jt = new JTest();
        jt.CreateJFrame();

    }
}
