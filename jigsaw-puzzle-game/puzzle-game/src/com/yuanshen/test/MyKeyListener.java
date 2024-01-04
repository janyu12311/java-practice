package com.yuanshen.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener extends JFrame implements KeyListener {




    public MyKeyListener(){
        //设置大小
        this.setSize(603,680);
        //设置标题
        this.setTitle("测试");
        //设置页面居中
        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.addKeyListener(this);





        this.setVisible(true);



    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("我摁下了");


    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("我松开了");
        System.out.println(e.getKeyCode());

    }
}
