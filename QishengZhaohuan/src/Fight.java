import javax.print.DocPrintJob;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Fight extends JFrame implements ActionListener {
    myCharacter1 Mdiluke;
    myCharacter2 Mxingqiu;

    myCharacter3 Mhuangnv;

    enemyCharacter1 Ddiluke;
    enemyCharacter2 Dxingqiu;
    enemyCharacter3 Dhuangnv;
    JButton fight1 = new JButton("攻击敌方迪卢克");
    JButton fight2 = new JButton("攻击敌方行秋");
    JButton fight3 = new JButton("攻击敌方皇女");

    int chaozai=3;
    int FireZhengfa=4;
    int WaterZhengfa=5;
    int pugong=2;

    public Fight(myCharacter1 mdiluke, myCharacter2 mxingqiu, myCharacter3 mhuangnv,
                 enemyCharacter1 ddiluke, enemyCharacter2 dxingqiu, enemyCharacter3 dhuangnv)
            throws HeadlessException {
        this.Mdiluke = mdiluke;
        this.Mhuangnv = mhuangnv;
        this.Mxingqiu = mxingqiu;
        this.Ddiluke = ddiluke;
        this.Dhuangnv = dhuangnv;
        this.Dxingqiu = dxingqiu;
        if(Mdiluke.tool){
            chaozai++;
            FireZhengfa++;
            WaterZhengfa++;
            pugong++;
        }
        //设置界面宽高
        this.setSize(600, 100);
        //设置界面标题
        this.setTitle("攻击界面");
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
        fight1.setBounds(10, 10, 150, 50);
        fight2.setBounds(190, 10, 150, 50);
        fight3.setBounds(370, 10, 150, 50);

        this.getContentPane().add(fight1);
        this.getContentPane().add(fight2);
        this.getContentPane().add(fight3);
        fight1.addActionListener(this);
        fight2.addActionListener(this);
        fight3.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object choice = e.getSource();
        if (Frame.myCurrent == Frame.DILUKE) {
            //攻击了敌方迪卢克
            if (choice == fight1) {
                Frame.MshaiziNums-=2;
                if (Ddiluke.curElement.equals("雷")&&Ddiluke.ifLive) {
                    Ddiluke.blood -= chaozai;
                    Ddiluke.curElement = "无";
                    //改变敌方上场角色
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方迪卢克造成了"+chaozai+"点伤害,并改变敌方上场角色");
                } else if (Ddiluke.curElement.equals("水")&&Ddiluke.ifLive) {
                    Ddiluke.blood -= FireZhengfa;
                    Ddiluke.curElement = "无";
                    showJDialog("造成蒸发,你对敌方迪卢克造成了"+FireZhengfa+"点伤害");
                } else {
                    if(Ddiluke.ifLive){
                        Ddiluke.blood -= pugong;
                        Ddiluke.curElement = Mdiluke.element;
                        showJDialog("攻击成功,你对敌方迪卢克造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方行秋
            if (choice == fight2) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方行秋");
                if (Dxingqiu.curElement.equals("雷")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= chaozai;
                    Dxingqiu.curElement = "无";
                    //改变敌方上场角色
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方行秋造成了"+chaozai+"点伤害,并改变敌方上场角色");
                } else if (Dxingqiu.curElement.equals("水")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= FireZhengfa;
                    Dxingqiu.curElement = "无";
                    showJDialog("造成蒸发,你对敌方行秋造成了"+FireZhengfa+"点伤害");
                } else {
                    if(Dxingqiu.ifLive){
                        Dxingqiu.blood -= pugong;
                        Dxingqiu.curElement = Mdiluke.element;
                        showJDialog("攻击成功,你对敌方行秋造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方皇女
            if (choice == fight3) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方皇女");
                if (Dhuangnv.curElement.equals("雷")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= chaozai;
                    Dhuangnv.curElement = "无";
                    //改变敌方上场角色
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方皇女造成了"+chaozai+"点伤害,并改变敌方上场角色");
                    this.setVisible(false);
                    new enemyFight();
                } else if (Dhuangnv.curElement.equals("水")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= FireZhengfa;
                    Dhuangnv.curElement = "无";
                    showJDialog("造成蒸发,你对敌方皇女造成了"+FireZhengfa+"点伤害");
                } else {
                    if(Dhuangnv.ifLive){
                        Dhuangnv.blood -= pugong;
                        Dhuangnv.curElement = Mdiluke.element;
                        showJDialog("攻击成功,你对敌方皇女造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
        }
        //我方是行秋
        else if(Frame.myCurrent==Frame.XINGQIU){
            //攻击了敌方迪卢克
            if (choice == fight1) {
                Frame.MshaiziNums-=2;
                if (Ddiluke.curElement.equals("雷")&&Ddiluke.ifLive) {
                    System.out.println("攻击了迪卢克");
                    Ddiluke.blood -= chaozai;
                    Ddiluke.curElement = "无";
                    Dxingqiu.blood-=1;
                    showJDialog("激发感电,你对敌方迪卢克,敌方行秋分别造成了"+chaozai+"点,1点伤害");
                } else if (Ddiluke.curElement.equals("火")&&Ddiluke.ifLive) {
                    Ddiluke.blood -= WaterZhengfa;
                    Ddiluke.curElement = "无";
                    showJDialog("造成蒸发,你对敌方迪卢克造成了"+WaterZhengfa+"点伤害");
                } else {
                    if(Ddiluke.ifLive){
                        System.out.println("攻击了迪卢克");
                        Ddiluke.blood -= pugong;
                        Ddiluke.curElement = Mxingqiu.element;
                        showJDialog("攻击成功,你对敌方迪卢克造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方行秋
            if (choice == fight2) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方行秋");
                if (Dxingqiu.curElement.equals("雷")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= chaozai;
                    Dxingqiu.curElement = "无";
                    Ddiluke.blood-=1;
                    Dhuangnv.blood-=1;
                    showJDialog("激发感电,你对敌方行秋,敌方迪卢克和皇女分别造成了"+chaozai+"点,1点,1点伤害");
                } else if (Dxingqiu.curElement.equals("火")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= WaterZhengfa;
                    Dxingqiu.curElement = "无";
                    showJDialog("造成蒸发,你对行秋造成了"+WaterZhengfa+"点伤害");
                } else {
                    if(Dxingqiu.ifLive){
                        Dxingqiu.blood -= pugong;
                        Dxingqiu.curElement = Mxingqiu.element;
                        showJDialog("攻击成功,你对敌方行秋造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方皇女
            if (choice == fight3) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方皇女");
                if (Dhuangnv.curElement.equals("雷")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= chaozai;
                    Dxingqiu.blood-=1;
                    Dhuangnv.curElement = "无";
                    showJDialog("激发感电,你对敌方皇女,行秋分别造成了"+chaozai+"点,1点伤害");
                } else if (Dhuangnv.curElement.equals("火")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= WaterZhengfa;
                    Dhuangnv.curElement = "无";
                    showJDialog("造成蒸发,你对敌方皇女造成了"+WaterZhengfa+"点伤害");
                } else {
                    if(Dhuangnv.ifLive){
                        Dhuangnv.blood -= pugong;
                        Dhuangnv.curElement = Mxingqiu.element;
                        showJDialog("攻击成功,你对敌方皇女造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
        }
        //当我方是皇女
        else if(Frame.myCurrent==Frame.HUANGNV){
            //攻击了敌方迪卢克
            if (choice == fight1) {
                Frame.MshaiziNums-=2;
                if (Ddiluke.curElement.equals("水")&&Ddiluke.ifLive) {
                    Ddiluke.blood -= chaozai;
                    Ddiluke.curElement = "无";
                    Dxingqiu.blood-=1;
                    showJDialog("激发感电,你对敌方迪卢克,敌方行秋分别造成了"+chaozai+"点,1点伤害");
                } else if (Ddiluke.curElement.equals("火")&&Ddiluke.ifLive) {
                    Ddiluke.blood -= chaozai;
                    Ddiluke.curElement = "无";
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方迪卢克造成了"+chaozai+"点伤害,并改变敌方上场角色");
                } else {
                    if(Ddiluke.ifLive){
                        Ddiluke.blood -= pugong;
                        Ddiluke.curElement = Mhuangnv.element;
                        showJDialog("攻击成功,你对敌方迪卢克造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方行秋
            if (choice == fight2) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方行秋");
                if (Dxingqiu.curElement.equals("水")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= chaozai;
                    Dxingqiu.curElement = "无";
                    Ddiluke.blood-=1;
                    Dhuangnv.blood-=1;
                    showJDialog("激发感电,你对敌方行秋,敌方迪卢克和皇女分别造成了"+chaozai+"点,1点,1点伤害");
                } else if (Dxingqiu.curElement.equals("火")&&Dxingqiu.ifLive) {
                    Dxingqiu.blood -= chaozai;
                    Dxingqiu.curElement = "无";
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方行秋造成了"+chaozai+"点伤害,并改变敌方上场角色");
                } else {
                    if(Dxingqiu.ifLive){
                        Dxingqiu.blood -= pugong;
                        Dxingqiu.curElement = Mhuangnv.element;
                        showJDialog("攻击成功,你对敌方行秋造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
            //攻击了敌方皇女
            if (choice == fight3) {
                Frame.MshaiziNums-=2;
                System.out.println("点击了攻击敌方皇女");
                if (Dhuangnv.curElement.equals("水")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= chaozai;
                    Dhuangnv.curElement = "无";
                    Dxingqiu.blood-=1;
                    showJDialog("激发感电,你对敌方皇女,行秋分别造成了"+chaozai+"点,1点伤害");
                } else if (Dhuangnv.curElement.equals("火")&&Dhuangnv.ifLive) {
                    Dhuangnv.blood -= chaozai;
                    Dhuangnv.curElement = "无";
                    changeFightCharacter();
                    showJDialog("激发超载,你对敌方皇女造成了"+chaozai+"点伤害,并改变敌方上场角色");

                } else {
                    if(Dhuangnv.ifLive){
                        Dhuangnv.blood -= pugong;
                        Dhuangnv.curElement = Mhuangnv.element;
                        showJDialog("攻击成功,你对敌方皇女造成了"+pugong+"点伤害");
                    }else{
                        showJDialog("请不要攻击死人");
                        System.exit(0);
                    }

                }
            }
        }
        if(Ddiluke.blood<=0){
            Ddiluke.blood=0;
            Ddiluke.ifLive=false;
        }
        if(Dxingqiu.blood<=0){
            Dxingqiu.blood=0;
            Dxingqiu.ifLive=false;
        }
        if(Dhuangnv.blood<=0){
            Dhuangnv.blood=0;
            Dhuangnv.ifLive=false;
        }
        if(!Ddiluke.ifLive&&!Dxingqiu.ifLive&&!Dhuangnv.ifLive){
            this.setVisible(false);
            showJDialog("你赢了！");
            System.exit(0);
        }
        if(!Mdiluke.ifLive&&!Mxingqiu.ifLive&&!Mhuangnv.ifLive){
            this.setVisible(false);
            showJDialog("你输了");
            System.exit(0);
        }
        if(!Ddiluke.ifLive&&Frame.DCurrent==1){
            System.out.println("当前角色死了");
            Frame.DCurrent=2;
        }
        if(!Dxingqiu.ifLive&&Frame.DCurrent==2){
            System.out.println("当前角色死了");
            Frame.DCurrent=3;
        }
        if(!Dhuangnv.ifLive&&Frame.DCurrent==3){
            System.out.println("当前角色死了");
            Frame.DCurrent=1;
        }
        if(!Ddiluke.ifLive&&Frame.DCurrent==1){
            System.out.println("当前角色死了");
            Frame.DCurrent=2;
        }
        if(!Dxingqiu.ifLive&&Frame.DCurrent==2){
            System.out.println("当前角色死了");
            Frame.DCurrent=3;
        }
        if(!Dhuangnv.ifLive&&Frame.DCurrent==3){
            System.out.println("当前角色死了");
            Frame.DCurrent=1;
        }

        this.setVisible(false);
        new enemyFight();


    }

    //弹窗
    JDialog jDialog = new JDialog();

    //弹窗
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(400, 100);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 400, 100);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    public void changeFightCharacter() {
        if (Frame.DCurrent == 1) {
            Frame.DCurrent = 2;
        } else if (Frame.DCurrent == 3) {
            Frame.DCurrent = 2;
        } else {
            Random r = new Random();
            int tmp = r.nextInt(2);
            if (tmp == 0) {
                Frame.DCurrent--;
            } else {
                Frame.DCurrent++;
            }
        }
    }

}

