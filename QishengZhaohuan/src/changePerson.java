import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePerson extends JFrame implements ActionListener {
    JButton change1 = new JButton("换成迪卢克");
    JButton change2 = new JButton("换成行秋");
    JButton change3 = new JButton("换成皇女");
    public changePerson() throws HeadlessException {
        //设置界面宽高
        this.setSize(600, 100);
        //设置界面标题
        this.setTitle("换人界面");
        //设置置顶
        this.setAlwaysOnTop(false);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中位置
        this.setLayout(null);
        //      this.getContentPane().setBackground(new Color(255,192,203));
        this.getContentPane().setBackground(new Color(212, 212, 212));
        change1.setBounds(10, 10, 150, 50);
        change2.setBounds(190, 10, 150, 50);
        change3.setBounds(370, 10, 150, 50);

        this.getContentPane().add(change1);
        this.getContentPane().add(change2);
        this.getContentPane().add(change3);
        change1.addActionListener(this);
        change2.addActionListener(this);
        change3.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object choice=e.getSource();
        if(choice==change1&&Frame.myCurrent!=1&&Frame.Mdiluke.ifLive){
            showJDialog("更换成功!");
            Frame.myCurrent=1;
            this.setVisible(false);
            new enemyFight();
        }else if(choice==change2&&Frame.myCurrent!=2&&Frame.Mxingqiu.ifLive){
            showJDialog("更换成功!");
            Frame.myCurrent=2;
            this.setVisible(false);
            new enemyFight();
        }else if(choice==change3&&Frame.myCurrent!=3&&Frame.Mhuangnv.ifLive){
            showJDialog("更换成功!");
            Frame.myCurrent=3;
            this.setVisible(false);
            new enemyFight();
        }

    }
    JDialog jDialog = new JDialog();
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 100);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 100);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

}
