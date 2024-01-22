import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class Frame extends JFrame implements ActionListener {
    static public String[] tools={"最好的伙伴!&持续3轮增加2个点数","狼末&增加伤害","蒙德土豆饼&给场上所有角色回一滴血"};
    JLabel theBestFriend;
    JLabel langM;
    static final int DILUKE=1;
    static final int HUANGNV=3;
    static final int XINGQIU=2;
    static int partnerNums=0;

    //敌方是否先结束
    static boolean EgiveUp=false;
    static public int myCurrent=Frame.DILUKE;
    static public int DCurrent=Frame.DILUKE;
    static public int DshaiziNums;
    static public int MshaiziNums;
    //存储道具的数量
    static ArrayList<String> toolsHave=new ArrayList<>();
    Random r=new Random();
    static {
        Random r=new Random();
        int tmp=r.nextInt(3);
        if(tmp!=0){
            int tmp2=r.nextInt(tools.length);
            toolsHave.add(tools[tmp2]);

      }
        DshaiziNums=r.nextInt(10)+1;
        MshaiziNums=r.nextInt(10)+1;
    }

    static myCharacter1 Mdiluke=new myCharacter1();
    static myCharacter2 Mxingqiu=new myCharacter2();

    static myCharacter3 Mhuangnv=new myCharacter3();

    static enemyCharacter1 Ddiluke=new enemyCharacter1();
    static enemyCharacter2 Dxingqiu=new enemyCharacter2();
    static enemyCharacter3 Dhuangnv=new enemyCharacter3();
    JButton jt1=new JButton("攻击");
    JButton jt2=new JButton("换人");
    JButton jt3=new JButton("结束这一轮");

    //敌方按钮
    JButton ec1=new JButton(Ddiluke.curElement);
    JButton ec2=new JButton(Dxingqiu.curElement);
    JButton ec3=new JButton(Dhuangnv.curElement);

    //我方按钮
    JButton mc1=new JButton(Mdiluke.curElement);
    JButton mc2=new JButton(Mxingqiu.curElement);
    JButton mc3=new JButton(Mhuangnv.curElement);
    //使用道具按钮
    JButton useTool=new JButton("使用道具");

    JLabel myNums=new JLabel();
    JLabel dNums=new JLabel();
    JTable toolList;
    static boolean wanjiaIsGiveup=false;
    public Frame() {
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
        InitFrame();
        InitJMenuBar();
    }

    private void InitJMenuBar() {

    }

    private void InitFrame() {
        //设置界面宽高
        this.setSize(1380,800);
        //设置界面标题
        this.setTitle("七圣召唤");
        //设置置顶
        this.setAlwaysOnTop(false);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中位置
        this.setLayout(null);
  //      this.getContentPane().setBackground(new Color(255,192,203));
        this.getContentPane().setBackground(new Color(212,212,212));
        //敌方角色
        JLabel enemyCharacter1 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\迪卢克2.png"));
        JLabel enemyCharacter2 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\行秋2.png"));
        JLabel enemyCharacter3 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\皇女2.png"));
        //敌方死亡角色
        JLabel diedEnemyCharacter1 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\迪卢克阵亡.png"));
        JLabel diedEnemyCharacter2 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\行秋阵亡.png"));
        JLabel diedEnemyCharacter3 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\皇女阵亡.png"));
        diedEnemyCharacter1.setBounds(330, 40, 130, 220);
        diedEnemyCharacter2.setBounds(610, 40, 130, 220);
        diedEnemyCharacter3.setBounds(890, 40, 130, 220);
        this.getContentPane().add(diedEnemyCharacter1);
        this.getContentPane().add(diedEnemyCharacter2);
        this.getContentPane().add(diedEnemyCharacter3);
        diedEnemyCharacter1.setVisible(false);
        diedEnemyCharacter2.setVisible(false);
        diedEnemyCharacter3.setVisible(false);
        enemyCharacter1.setBounds(330, 40, 130, 220);
        enemyCharacter2.setBounds(610, 40, 130, 220);
        enemyCharacter3.setBounds(890, 40, 130, 220);
        myNums.setBounds(470,400,100,40);
        dNums.setBounds(470,40,100,40);
        //我方血量设置
        JLabel myCharacter1Blood=new JLabel("剩余血量"+Mdiluke.blood);
        JLabel myCharacter2Blood=new JLabel("剩余血量"+Mxingqiu.blood);
        JLabel myCharacter3Blood=new JLabel("剩余血量"+Mhuangnv.blood);
        myCharacter1Blood.setFont(new Font("宋体", Font.BOLD, 13));
        myCharacter2Blood.setFont(new Font("宋体", Font.BOLD, 13));
        myCharacter3Blood.setFont(new Font("宋体", Font.BOLD, 13));
        myCharacter1Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        myCharacter2Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        myCharacter3Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        myCharacter1Blood.setBounds(250, 600, 100, 30);
        myCharacter2Blood.setBounds(540, 600, 100, 30);
        myCharacter3Blood.setBounds(810, 600, 100, 30);
        this.getContentPane().add(myCharacter1Blood);
        this.getContentPane().add(myCharacter2Blood);
        this.getContentPane().add(myCharacter3Blood);
        //敌方血量设置
                JLabel enemyCharacter1Blood=new JLabel("剩余血量"+Ddiluke.blood);
                JLabel enemyCharacter2Blood=new JLabel("剩余血量"+Dxingqiu.blood);
                JLabel enemyCharacter3Blood=new JLabel("剩余血量"+Dhuangnv.blood);
        enemyCharacter1Blood.setFont(new Font("宋体", Font.BOLD, 13));
        enemyCharacter2Blood.setFont(new Font("宋体", Font.BOLD, 13));
        enemyCharacter3Blood.setFont(new Font("宋体", Font.BOLD, 13));
        enemyCharacter1Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        enemyCharacter2Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        enemyCharacter3Blood.setBorder(BorderFactory.createLineBorder(Color.RED));
        enemyCharacter1Blood.setBounds(250, 240, 100, 30);
        enemyCharacter2Blood.setBounds(540, 240, 100, 30);
        enemyCharacter3Blood.setBounds(810, 240, 100, 30);
        this.getContentPane().add(enemyCharacter1Blood);
        this.getContentPane().add(enemyCharacter2Blood);
        this.getContentPane().add(enemyCharacter3Blood);


        myNums.setFont(new Font("宋体", Font.BOLD, 14));
        dNums.setFont(new Font("宋体", Font.BOLD, 14));
        this.getContentPane().add(myNums);
        this.getContentPane().add(dNums);
        dNums.setText("剩余点数为"+DshaiziNums);
        myNums.setText("剩余点数为"+MshaiziNums);
        this.getContentPane().add(enemyCharacter1);
        this.getContentPane().add(enemyCharacter2);
        this.getContentPane().add(enemyCharacter3);
        //我方角色
        JLabel myCharacter1 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\迪卢克2.png"));
        JLabel myCharacter2 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\行秋2.png"));
        JLabel myCharacter3 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\皇女2.png"));
        myCharacter1.setBounds(330, 400, 130, 220);
        myCharacter2.setBounds(610, 400, 130, 220);
        myCharacter3.setBounds(890, 400, 130, 220);
        this.getContentPane().add(myCharacter1);
        this.getContentPane().add(myCharacter2);
        this.getContentPane().add(myCharacter3);
        //我方死亡角色
        JLabel diedMyCharacter1 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\迪卢克阵亡.png"));
        JLabel diedMyCharacter2 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\行秋阵亡.png"));
        JLabel diedMyCharacter3 = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\皇女阵亡.png"));
        diedMyCharacter1.setBounds(330, 400, 130, 220);
        diedMyCharacter2.setBounds(610, 400, 130, 220);
        diedMyCharacter3.setBounds(890, 400, 130, 220);
        diedMyCharacter1.setVisible(false);
        diedMyCharacter2.setVisible(false);
        diedMyCharacter3.setVisible(false);
        this.getContentPane().add(diedMyCharacter1);
        this.getContentPane().add(diedMyCharacter2);
        this.getContentPane().add(diedMyCharacter3);
        //判断是否有人死亡
        if(Ddiluke.blood<=0){
            System.out.println("迪卢克死了");
            Ddiluke.blood=0;
            Ddiluke.ifLive=false;
            enemyCharacter1Blood.setText("剩余血量"+Ddiluke.blood);
            enemyCharacter1.setVisible(false);
            diedEnemyCharacter1.setVisible(true);
        }
        if(Dxingqiu.blood<=0){
            System.out.println("行秋死了");
            Dxingqiu.blood=0;
            enemyCharacter2Blood.setText("剩余血量"+Dxingqiu.blood);

            Dxingqiu.ifLive=false;
            enemyCharacter2.setVisible(false);
            diedEnemyCharacter2.setVisible(true);
        }
        if(Dhuangnv.blood<=0){
            System.out.println("皇女死了");

            Dhuangnv.blood=0;
            enemyCharacter3Blood.setText("剩余血量"+Dhuangnv.blood);
            Dhuangnv.ifLive=false;
            enemyCharacter3.setVisible(false);
            diedEnemyCharacter3.setVisible(true);
        }
        if(Mdiluke.blood<=0){

            Mdiluke.blood=0;
            Mdiluke.ifLive=false;
            myCharacter1.setVisible(false);
            myCharacter1Blood.setText("剩余血量"+Mdiluke.blood);
            diedMyCharacter1.setVisible(true);
        }
        if(Mxingqiu.blood<=0){
            Mxingqiu.blood=0;
            Mxingqiu.ifLive=false;
            myCharacter2Blood.setText("剩余血量"+Mxingqiu.blood);
            myCharacter2.setVisible(false);
            diedMyCharacter2.setVisible(true);
        }
        if(Mhuangnv.blood<=0){
            Mhuangnv.blood=0;
            Mhuangnv.ifLive=false;
            myCharacter3Blood.setText("剩余血量"+Mhuangnv.blood);
            myCharacter3.setVisible(false);
            diedMyCharacter3.setVisible(true);
        }
        //设置道具
        theBestFriend = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\最好的伙伴!2.png"));
        langM = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\狼末2.png"));
        theBestFriend.setBounds(50, 400, 130, 180);
        langM.setBounds(200, 400, 100, 180);
        if(partnerNums==0){
            theBestFriend.setVisible(false);
        }
        if(!Mdiluke.tool){
            langM.setVisible(false);
        }
        this.getContentPane().add(theBestFriend);
        this.getContentPane().add(langM);
        //设置按钮
        jt1.setBounds(320,700,90,40);
        this.getContentPane().add(jt1);
        jt2.setBounds(635,700,90,40);
        this.getContentPane().add(jt2);
        jt3.setBounds(950,700,140,40);
        this.getContentPane().add(jt3);

        ec1.setBounds(350,265,80,30);
        this.getContentPane().add(ec1);
        ec2.setBounds(640,265,80,30);
        this.getContentPane().add(ec2);
        ec3.setBounds(920,265,80,30);
        this.getContentPane().add(ec3);

        mc1.setBounds(350,630,80,30);
        this.getContentPane().add(mc1);
        mc2.setBounds(640,630,80,30);
        this.getContentPane().add(mc2);
        mc3.setBounds(920,630,80,30);
        this.getContentPane().add(mc3);
        // 更改背景颜色
        if(Frame.DCurrent==Frame.DILUKE){
            ec1.setBackground(Color.YELLOW);
        }else if(Frame.DCurrent==Frame.XINGQIU){
            ec2.setBackground(Color.YELLOW);
        }else{
            ec3.setBackground(Color.YELLOW);
        }
        if(Frame.myCurrent==Frame.DILUKE){
            mc1.setBackground(Color.YELLOW);
        }else if(Frame.myCurrent==Frame.XINGQIU){
            mc2.setBackground(Color.YELLOW);
        }else{
            mc3.setBackground(Color.YELLOW);
        }
        useTool.setBounds(1150,600,120,30);
        this.getContentPane().add(useTool);
        //道具展示文本
        Object[] tableTitles = {"道具名", "作用"};
        Object[][] tabledatas=new Object[toolsHave.size()][2];
        int index=0;
        for (String s : toolsHave) {
            String[] split = s.split("&");
            tabledatas[index][0]=split[0];
            tabledatas[index][1]=split[1];
            index++;
        }
        toolList = new JTable(tabledatas, tableTitles);
        toolList.setBounds(1050, 80, 300, 500);
        JScrollPane jScrollPane = new JScrollPane(toolList);
        jScrollPane.setBounds(1050,80,300,500);
        this.getContentPane().add(jScrollPane);
        //牌桌
        JLabel table = new JLabel(new ImageIcon("..\\QishengZhaohuan\\image\\牌桌2.png"));
        table.setBounds(0, 0, 1350, 680);
        this.getContentPane().add(table);

        jt1.addActionListener(this);
        jt2.addActionListener(this);
        jt3.addActionListener(this);
        ec1.addActionListener(this);
        ec2.addActionListener(this);
        ec3.addActionListener(this);
        mc1.addActionListener(this);
        mc2.addActionListener(this);
        mc3.addActionListener(this);
        useTool.addActionListener(this);


        this.setVisible(true);
    }

    JDialog jDialog = new JDialog();
    //弹窗
    public void showJDialog(String content) {
        if(!jDialog.isVisible()){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(400, 250);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 250, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //开始攻击
        Object choice=e.getSource();
        if(choice==jt1){
            System.out.println("点击了攻击");
                if(MshaiziNums<2){
                    showJDialog("点数不够,请重新选择");
                }else{

                    new Fight(Mdiluke,Mxingqiu,Mhuangnv,Ddiluke,Dxingqiu,Dhuangnv);
                    this.setVisible(false);
                }
        }
        //换人
        else if(choice==jt2){
            this.setVisible(false);
            new changePerson();
        }
        //结束这一轮
        else if(choice==jt3){
            System.out.println("玩家放弃");
            wanjiaIsGiveup=true;
            this.setVisible(false);
            System.out.println("我在主框架看看"+DshaiziNums);
            new enemyFight();
            wanjiaIsGiveup=false;
        }
        //使用道具
        else if(choice==useTool){
            int index=toolList.getSelectedRow();
            if(index==-1){
                showJDialog("请选择道具");
            }else{
                String tool = toolsHave.get(index).split("&")[0];
                toolsHave.remove(index);
                if(tool.equals("狼末")){
                    showJDialog("道具使用成功!");
                    Mdiluke.tool=true;
                    langM.setVisible(true);
                }else if(tool.equals("最好的伙伴!")){
                    showJDialog("道具使用成功!");
                    theBestFriend.setVisible(true);
                    partnerNums=3;
                    MshaiziNums+=2;
                }else if(tool.equals("蒙德土豆饼")){
                    showJDialog("道具使用成功!");
                    if (Mdiluke.blood!=10){
                        Mdiluke.blood++;
                    }
                    if (Mxingqiu.blood!=10){
                        Mxingqiu.blood++;
                    }
                    if (Mhuangnv.blood!=10){
                        Mhuangnv.blood++;
                    }
                }
                this.setVisible(false);
                new Frame();
            }
        }

    }
}
