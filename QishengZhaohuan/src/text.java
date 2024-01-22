import javax.swing.*;

public class text{
    public text() {
        JFrame jFrame=new JFrame();
        JTextArea jTextArea = new JTextArea(500,500);
        jTextArea.append("你好");
        jFrame.add(jTextArea);
        jFrame.setSize(80,80);
        //设置界面宽高
        //设置界面标
        jTextArea.setVisible(true);
        jFrame.setVisible(true);

    }
}
