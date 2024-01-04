package com.yuanshen.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;

public class GameFrame extends JFrame implements KeyListener, ActionListener {

    //成员
    //加载图片的时候会根据二维数组加载
    //创建一个二维数组
    int[][] data = new int[4][4];
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("赞助作者");
    JMenuItem replayPicture = new JMenuItem("更换照片");
    JMenuItem rule1 = new JMenuItem("游戏将打乱的照片复原就获胜，摁a则可以显示照片，" +
            "摁w可以直接通关，如果不喜欢这个照片可以更换照片");


    String path = "image\\animal\\animal";
    Random r = new Random();
    int rand = r.nextInt(8) + 1;
    //位置
    int x = 0;
    int y = 0;

    //定义变量用来统计步数
    int step = 0;


    //游戏主页面的类
    public GameFrame() {
        // 初始化界面
        initFrame();
        //初始化菜单
        initJMenubar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();


        //让界面显示出来
        this.setVisible(true);
    }

    //初始化数据，打乱数据
    private void initData() {
        int[] tmpArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < tmpArr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(tmpArr.length);
            int temp = tmpArr[index];
            tmpArr[index] = tmpArr[i];
            tmpArr[i] = temp;
        }


        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tmpArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        this.getContentPane().removeAll();
        //判断是否胜利
        if (victory()) {
            //显示胜利图标
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个图片ImageIcon的对象
                //创建一个JLabel的对象(管理容器)

                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + rand + "\\" + num + ".jpg"));
                jLabel.setBounds(105 * j + 83, 105 * i + 143, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面当中
                this.getContentPane().add(jLabel);
            }
        }

        //背景
        JLabel bg = new JLabel(new ImageIcon("image\\background.png"));

        //设置位置
        bg.setBounds(40, 40, 508, 560);

        //添加进去
        this.getContentPane().add(bg);

        this.getContentPane().repaint();


    }

    private void initJMenubar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单两个选项(功能 关于我们);
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu rule = new JMenu("规则");

        //将菜单选项下面的条目添加到选项里面
        functionJMenu.add(replayItem);
        //     functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(replayPicture);
        aboutJMenu.add(accountItem);
        rule.add(rule1);
        //给条目绑定事件
        replayItem.addActionListener(this);
//        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        replayPicture.addActionListener(this);

        //将两个菜单选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        jMenuBar.add(rule);
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("Elysian剑彧的3A大作拼图游戏");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消居中放置
        this.setLayout(null);
        //添加键盘监听事件
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面全部删除
            this.getContentPane().removeAll();
            //加载一张完整图片
            JLabel all = new JLabel(new ImageIcon(path + rand + "\\" + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            //背景
            JLabel bg = new JLabel(new ImageIcon("image\\background.png"));
            //设置位置
            bg.setBounds(40, 40, 508, 560);
            //添加进去
            this.getContentPane().add(bg);

            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            //如果赢了别动了
            return;
        }
        //对上下左右进行判断
        int code = e.getKeyCode();
        if (code == 37) {
            if (y < 3) {
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                initImage();
            }
        } else if (code == 38) {
            //判断边界
            if (x < 3) {
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                //按照刚才的方法重新加载页面

                step++;
                initImage();
            }

        } else if (code == 39) {
            if (y > 0) {
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;

                step++;
                initImage();
            }
        } else if (code == 40) {
            if (x > 0) {
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;

                step++;
                //按照刚才的方法重新加载页面
                initImage();
            }
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            x = 3;
            y = 3;
            initImage();
        }

    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        //判断
        if (obj == replayItem) {
            System.out.println("重新游戏");
            initData();
            step = 0;
            initImage();
        } else if (obj == reLoginItem) {
            //关闭游戏界面
            this.setVisible(false);
            //打开登陆界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.exit(0);
        } else if (obj == accountItem) {
            //创建一个弹框对象
            JDialog jd = new JDialog();
            //管理图片
            JLabel jb = new JLabel(new ImageIcon("image\\赞助作者.jpg"));
            jb.setBounds(0, 0, 190, 258);
            jd.getContentPane().add(jb);
            jd.setSize(344, 344);
            jd.setAlwaysOnTop(true);
            jd.setLocationRelativeTo(null);
            jd.setModal(true);
            jd.setVisible(true);
        } else if (obj == replayPicture) {
            rand = r.nextInt(8) + 1;
            initImage();
        }


    }
}
