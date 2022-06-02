package Login;

import java.io.*;

/**
 *读取name.txt和password.txt文件并判断是否存在shr和123456，用户名为shr，密码为123456，并输入用户名和密码，如果用户名和密码正确，则输出登录成功，否则输出登录失败
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

            System.out.println("请输入用户名：");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br2 = new BufferedReader(isr);
            String name1 = br2.readLine();
            System.out.println("请输入密码：");
            String password1 = br2.readLine();

            if (name.equals(name1) && password.equals(password1)){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
