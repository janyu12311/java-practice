package com.yuanshen.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyActionListener extends JFrame implements MouseListener {

    JButton jbt1=new JButton("点我啊 ");

    public MyActionListener(){
        //设置大小
        this.setSize(603,680);
        //设置标题
        this.setTitle("测试");
        //设置页面居中
        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        jbt1.setBounds(0,0,100,50);
        //给按钮绑定鼠标
        jbt1.addMouseListener(this);


        this.getContentPane().add(jbt1);



        this.setVisible(true);



    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");

    }
}
